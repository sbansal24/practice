package ExecutorPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExecutorCachedThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setUncaughtExceptionHandler((t1, e) -> {
                    System.out.println(t1.getName() + " has throws " + e.getMessage());
                });
                return t;
            }
        });
    }
}
