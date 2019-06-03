package CustomBlockingQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyArrayBlockingQueue<T> implements MyBlockingQueue<T> {
    private final Lock lock = new ReentrantLock();
    private final List<T> list;
    private int count = 0;
    private Condition listFull = lock.newCondition();
    private Condition listEmpty = lock.newCondition();
    private final int size;

    public MyArrayBlockingQueue(int size) {
        this.size = size;
        list = new ArrayList<>(size);
    }

    @Override
    public void put(T t) throws InterruptedException {
        lock.lockInterruptibly();
        try {
            while (size == list.size()) {
                listFull.await();
            }
            list.add(t);
            count++;
            listEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public T take() throws InterruptedException {
        lock.lockInterruptibly();
        try {
            while (list.isEmpty()) {
                listEmpty.await();
            }
            T t = list.remove(0);
            count--;
            listFull.signalAll();
            return t;
        } finally {
            lock.unlock();
        }
    }
}
