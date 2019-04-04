package MultiThreading.ThreadStart.ThreadTricks;

public class Child extends Parent {
    @Override
    public synchronized void method4() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " has entered method4.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " has outed method4.");
    }

    public synchronized static void method6() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " has entered method6.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " has outed method6.");
    }

    @Override
    public Integer test(int i){
        return 10;
    }
}
