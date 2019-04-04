package CyclicBarrier;

import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class NumberSumThread implements Runnable {
    private final List<Integer> counts;

    public NumberSumThread(List<Integer> counts) {
        this.counts = counts;
    }

    @Override
    public void run() {
        System.out.println("number adder is adding....");
        System.out.println(counts.parallelStream().reduce(0, Integer::sum));
    }
}
