import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1);
        Producer producer = new Producer(list);
        Consumer consumer = new Consumer(list);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("in shutdown hook")));
        System.out.println("application is ending");
    }
}

