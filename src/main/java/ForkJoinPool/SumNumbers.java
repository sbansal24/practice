package ForkJoinPool;

import java.util.concurrent.RecursiveTask;

public class SumNumbers extends RecursiveTask<Long> {
    private int[] array;
    private int low;
    private int high;

    public SumNumbers(int[] array, int low, int high) {
        this.array = array;
        this.low = low;
        this.high = high;
    }

    @Override
    protected Long compute() {
        if (high - low <= 5) {
            long sum = 0;
            for (int i = low; i < high; i++)
                sum += array[i];
            return sum;
        } else {
            int mid = low + (high - low) / 2;
            SumNumbers leftSum = new SumNumbers(array, low, mid);
            SumNumbers rightSum = new SumNumbers(array, mid, high);
            leftSum.fork();
            long rightResult = rightSum.compute();
            long leftResult = leftSum.join();
            return leftResult + rightResult;
        }
    }
}
