package CustomThreadPool;

import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
    LinkedBlockingQueue<Runnable> queue;

    public ThreadPool(Integer size) {
        this.queue = new LinkedBlockingQueue<>(size);
        for (int i = 0; i < size; i++) {
            PoolThread thread = new PoolThread(queue);
            thread.setName("thread - " + i);
            thread.start();
        }
    }

    public void execute(Runnable task) throws InterruptedException {
        this.queue.put(task);
    }
}
