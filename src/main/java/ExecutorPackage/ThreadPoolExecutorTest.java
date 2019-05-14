package ExecutorPackage;

import java.util.concurrent.*;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        Executors.newCachedThreadPool();
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(5, 8, 2L,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(2), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setUncaughtExceptionHandler((t, e) -> {
                    System.out.println("exception catched");
                });
                return thread;
            }
        }, new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable worker, ThreadPoolExecutor executor) {
                System.out.println(worker.toString() + " Thread is rejected");
                try {
                    Thread.sleep(1000);
                    if (!executor.isShutdown())
                        executor.getQueue().put(worker);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        for (int i = 1; i <= 100; i++) {
            threadPoolExecutor.execute(() -> {
                System.out.println("Thread Start to run");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread finish execution");
            });
        }
        threadPoolExecutor.shutdown();
    }
}
