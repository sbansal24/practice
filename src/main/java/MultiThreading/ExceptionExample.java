package MultiThreading;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println(hello());
        PriorityQueue<Integer> queue = new PriorityQueue<>(10);
        queue.offer(10);
        queue.offer(5);
        queue.offer(10);
        queue.offer(3);
        LinkedList<Integer> list = new LinkedList<>();

//        System.out.println(queue);

        Set<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(5);
        set.add(10);
        set.add(3);

//        System.out.println(set);
    }

    private static int hello() {
        try{
            throw new RuntimeException("exception");
        } finally {
            System.out.println("hello........");
            return 16;
        }
    }
}
