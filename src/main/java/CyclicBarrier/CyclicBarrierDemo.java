package CyclicBarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        List<Integer> counts = new ArrayList<>();

        NumberSumThread numberSumThread = new NumberSumThread(counts);

        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, numberSumThread);

        Thread thread1 = new Thread(new NumberAssignerThread(cyclicBarrier, counts), "thread1");
        Thread thread2 = new Thread(new NumberAssignerThread(cyclicBarrier, counts), "thread2");
        Thread thread3 = new Thread(new NumberAssignerThread(cyclicBarrier, counts), "thread3");
        Thread thread4 = new Thread(new NumberAssignerThread(cyclicBarrier, counts), "thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
