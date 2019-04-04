import java.util.List;

public class Producer implements Runnable{

    private final List<Integer> list;

    public Producer(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            synchronized (list) {
                try {
                    while (list.size() == 1) {
                        list.wait();
                    }
                    System.out.println("produced : " + ++i);
                    list.add(i);
                    Thread.sleep(300);
                    list.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
