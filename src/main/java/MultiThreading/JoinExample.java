package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            System.out.println("thread 1 has staterd");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread 1 has finished");
        });
        Thread t2 = new Thread(()->{
            System.out.println("thread 2 has staterd");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread 2 has finished");
        });
        Thread t3 = new Thread(()->{
            System.out.println("thread 3 has staterd");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread 3 has finished");
        });
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        System.out.println("work finished");
        List<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(list.indexOf(2)));
        System.out.println(list.remove(0));
        System.out.println("size "+list.size());
        System.out.println(list.remove(0));
        System.out.println("size "+list.size());
    }
}
