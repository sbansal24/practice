package CustomThreadPool;

public class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()
                    + " is executing task.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is being executing");
    }
}
