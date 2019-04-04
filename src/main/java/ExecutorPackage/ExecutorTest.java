package ExecutorPackage;

import java.util.concurrent.*;

public class ExecutorTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread.currentThread().setUncaughtExceptionHandler((t, e) -> System.out.println("general exception"));
        ExecutorService executorService = Executors.newFixedThreadPool(1, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t1, Throwable e) {
                        System.out.println("exception been caught");
                    }
                });
                return t;
            }
        });
        Thread t1 = new Thread(() -> System.out.println("thread one"));
        executorService.execute(t1);
        executorService.execute(() -> System.out.println("executor method"));
        Future<String> future = executorService.submit(() -> "submit method");
        System.out.println(future.get());
        try {
            future = executorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    throw new Exception("compile time exception");
                }
            });
            System.out.println(future.get());
        } catch (Exception e) {
            System.out.println("exception from callable");
        }
        executorService.execute(() -> {
            throw new RuntimeException("exception");
        });
        executorService.execute(() -> System.out.println("runnable method"));
        executorService.shutdown();
    }

}
