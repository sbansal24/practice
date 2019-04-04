package CustomThreadPool;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PoolThread extends Thread {
    BlockingQueue<Runnable> queue;

    public PoolThread(LinkedBlockingQueue<Runnable> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is ready to execute the task");
        try {
            Runnable runnable = queue.take();
            runnable.run();
            System.out.println(Thread.currentThread().getName() + " is executing the task");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" has been STOPPED.");
        }
    }
}
