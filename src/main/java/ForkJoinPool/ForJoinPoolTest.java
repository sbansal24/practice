package ForkJoinPool;

import java.util.concurrent.ForkJoinPool;

//program to sum integers using for join pool
public class ForJoinPoolTest {
    public static void main(String[] args) {

        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ForkJoinPool forkJoinPool = new ForkJoinPool(availableProcessors);
        int numbers[] = new int[1000];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
        }
        long result = forkJoinPool.invoke(new SumNumbers(numbers,0, numbers.length));
        System.out.println(result);

    }
}
