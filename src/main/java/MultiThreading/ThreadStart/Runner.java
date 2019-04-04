package MultiThreading.ThreadStart;

public class Runner implements Runnable {
    check c = new check();
    @Override
    public void run(){
        System.out.println("run method");
        try {
            System.out.println(Thread.currentThread().getName());
            for(int i=0;i<20;i++)
            c.test();
            System.out.println(c.getI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class check{
    int i = 10;
    public void test(){
        i++;
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(i);
    }

    public int getI() {
        return i;
    }
}
