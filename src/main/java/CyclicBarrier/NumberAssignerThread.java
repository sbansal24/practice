package CyclicBarrier;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class NumberAssignerThread implements Runnable {
    private final CyclicBarrier cyclicBarrier;
    private final List<Integer> counts;

    public NumberAssignerThread(CyclicBarrier cyclicBarrier, List<Integer> counts) {
        this.cyclicBarrier = cyclicBarrier;
        this.counts = counts;
    }

    @Override
    public void run() {
        try {
            int number = (int) (Math.random() * 5000);
            System.out.println(Thread.currentThread().getName() +" is waiting to get sum..." + number);
            counts.add(number);
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
