package CountDownLatch;

import java.util.PriorityQueue;
import java.util.concurrent.*;

public class DequeueTest {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<Delayed> queue = new DelayQueue<>();
        Delayed delayed = new Delayed() {
            @Override
            public long getDelay(TimeUnit unit) {
                return 5;
            }

            @Override
            public int compareTo(Delayed o) {
                return 0;
            }
        };
//        queue.put(delayed);
//        queue.take();
        BlockingQueue<String> queue1 = new LinkedTransferQueue<>();
    }
}
