package PCWitlLockApi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PCWithLocking {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        List<Integer> list = new ArrayList<>(1);
        Condition listIsFull = lock.newCondition();
        Condition listIsEmpty = lock.newCondition();

        Producer producer = new Producer(lock, list, listIsFull, listIsEmpty);
        Consumer consumer = new Consumer(lock, list, listIsFull, listIsEmpty);

        Thread t1 = new Thread(producer);
        Thread t2  = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
