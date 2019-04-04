package MultiThreading.ExecutorService;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        executorService = Executors.newCachedThreadPool();
        Future<String> future =  executorService.submit(()-> "test");
        System.out.println(future.get());

        //changing runnable to callable
        Future<Object> future1 =  executorService.submit(Executors.callable(()-> System.out.println("hello")));
        System.out.println(future1.get());
        executorService.shutdown();
        ArrayList list = new ArrayList();
        System.out.println(list.size());
        Set set = new HashSet();
        Map map = new HashMap();

    }
}
