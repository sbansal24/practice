package CountDownLatch;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class WorkerThread implements Runnable {
    private final List<String> nameList;
    private final CountDownLatch latch;

    public WorkerThread(List<String> nameList, CountDownLatch latch) {
        this.nameList = nameList;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            nameList.add("worker latch");
        }finally {
            latch.countDown();
        }
    }
}
