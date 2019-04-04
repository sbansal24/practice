package CustomThreadPool;

public class CustomThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadPool threadPool = new ThreadPool(3);
        Task task = new Task();
        threadPool.execute(task);
        threadPool.execute(task);
        threadPool.execute(task);

        threadPool.execute(task);
        threadPool.execute(task);

    }
}
