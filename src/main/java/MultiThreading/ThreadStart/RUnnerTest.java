package MultiThreading.ThreadStart;

public class RUnnerTest {
    public static void main(String[] args) {
        Runner r1 = new Runner();
        Thread t1 = new Thread(r1);
        t1.start();
        Runner r2 = new Runner();
        Thread t2 = new Thread(r2);
        t2.start();
        Runner r3 = new Runner();
        Thread t3 = new Thread(r3);
        t3.start();

        Thread t4 = new Thread(() -> {
            throw new RuntimeException("run time exception");
        });
        t4.setUncaughtExceptionHandler((t, e) -> System.out.println(t.getName() + " is throwing " + e.getMessage()));
        t4.start();
    }
}
