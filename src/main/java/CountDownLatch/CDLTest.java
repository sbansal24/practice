package CountDownLatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CDLTest {

    public static void main(String[] args) throws InterruptedException {
        List<String> countList = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(5);
//        List<Thread> workerThreads = Stream.generate(() -> new Thread(new WorkerThread(countList, countDownLatch)))
//                .limit(5).collect(Collectors.toList());
//equivalent
        List<Thread> workerThreads = new ArrayList<>();
        for (long count = 5; count > 0; count--) {
            Thread thread = new Thread(new WorkerThread(countList, countDownLatch));
            workerThreads.add(thread);
        }
        workerThreads.forEach(Thread::start);
        countDownLatch.await();
        countList.add("finished work");
        countList.forEach(System.out::println);
    }
}
