package PCWithBQ;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PCWithBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(1);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.setUncaughtExceptionHandler((t, e) -> System.out.println(t.getName() + "has done with " + e.getMessage()));
//
//        t1.start();
//        t2.start();

        PriorityQueue queue1 = new PriorityQueue<>(10);
        queue1.add(10);
//        queue1.add("abc");
//        queue1.add(new Employee(1, "abc"));
//        queue1.add(new Employee(2, "xyz"));

        PriorityQueue<Employee> queue2 = new PriorityQueue<>(5, Comparator.comparing(Employee::getEmpName));
        queue2.add(new Employee(1,"abc"));
//        queue2.add(new Employee(2,"abc1"));

    }
}
