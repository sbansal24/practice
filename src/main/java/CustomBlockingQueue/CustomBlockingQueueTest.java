package CustomBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CustomBlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        MyBlockingQueue<Integer> queue = new MyArrayBlockingQueue<>(5);
        queue.put(10);
        queue.put(20);
        System.out.println( queue.take());
        queue.put(30);
        System.out.println(queue.take());
//        System.out.println(queue.take());
//        System.out.println(queue.take());
//        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(1);
//        blockingQueue.put(10);
//        blockingQueue.put(20);
//        System.out.println(blockingQueue.take());


    }
}
