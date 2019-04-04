import java.util.List;

public class Consumer implements Runnable{
    private final List<Integer> list;

    public Consumer(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                try {
                    while (list.isEmpty()) {
                        list.wait();
                    }
                    System.out.println("consumed : " + list.remove(0));
                    Thread.sleep(300);
                    list.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
