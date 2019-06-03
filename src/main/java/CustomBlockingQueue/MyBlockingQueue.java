package CustomBlockingQueue;

public interface MyBlockingQueue<T> {
    void put(T t) throws InterruptedException;
    T take() throws InterruptedException;
}
