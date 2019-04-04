package DailyPractice.March19;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(9 - 4 * 2 + 10.0 / 3);
        AtomicInteger sum = new AtomicInteger(0);
        ExecutorService poolService = Executors.newFixedThreadPool(4);
        ExecutorCompletionService<Integer> executorCompletionService = new ExecutorCompletionService<>(poolService);
        List<Future<Integer>> futureList = new ArrayList<>();
        futureList.add(executorCompletionService.submit(new CompletionTask("task1")));
        futureList.add(executorCompletionService.submit(new CompletionTask("task2")));
        futureList.add(executorCompletionService.submit(new CompletionTask("task3")));
        futureList.add(executorCompletionService.submit(new CompletionTask("task4")));
        futureList.stream().forEach(list -> {
            try {
                Future<Integer> future = executorCompletionService.take();
                sum.addAndGet(future.get());

            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
        System.out.println(sum.get());
        poolService.shutdown();
        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);

    }
}
