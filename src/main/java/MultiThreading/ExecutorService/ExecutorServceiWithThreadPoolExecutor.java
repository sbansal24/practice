package MultiThreading.ExecutorService;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorServceiWithThreadPoolExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(4, 10 , 100, TimeUnit.SECONDS, new LinkedBlockingDeque<>(10));
        AtomicInteger atomicInteger = new AtomicInteger(5);
        atomicInteger.compareAndSet(5,8);
        System.out.println(atomicInteger.get());

        Thread t1 = new Thread(()->{
           throw new RuntimeException();
        });
        t1.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("Exception while running");
        });

        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(100);
                System.out.println("second thread");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        try {

            t1.start();
            t2.start();
        } catch (Exception e){
            System.out.println("catched exception");
        }
    }
}
