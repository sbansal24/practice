package MultiThreading;

public class Exceptiontest {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup tg = new ThreadGroup("abc") {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName() + " has throw exception " + e.getMessage());
            }
        };

        Thread t1 = new Thread(() -> {
            System.out.println("in thread t1");
            throw new RuntimeException("Runtime Exception from t1");
        });

        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.out.println("default exception catch method");
        });

        t1.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("catching exception from Thread 1 " + e.getMessage());
        });

        Thread t2 = new Thread(tg, () -> {
            System.out.println("in thread t2");
            throw new RuntimeException("Runtime Exception from t2");
        });

        t1.start();
        Thread.sleep(1000);
        t2.start();
        System.out.println("exiting the main");
    }
}
