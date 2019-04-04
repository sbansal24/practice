package DeadLock;

public class Resource2 implements Runnable {
    private final String str1;
    private final String str2;
    public Resource2(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public void run() {
        System.out.println("in resource 2");
            try {
                synchronized (str2) {
                    Thread.sleep(100);
                    synchronized (str1){
                        System.out.println("in resource 2 deadlock");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
