package DeadLock;

public class Resource1 implements  Runnable{
    private final String str1;
    private final String str2;
    public Resource1(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public void run() {
        System.out.println("in resource 1");
            try {
                synchronized (str1) {
                    Thread.sleep(100);
                    synchronized (str2){
                        System.out.println("in resource 1 deadlock");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
