package FutureAndCallable;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
        completableFuture.thenAccept(integer -> {
            completableFuture.getNow(10);
        });

        Future<Integer> future = executorService.submit(() -> 20);
        future.get();

    }
}
