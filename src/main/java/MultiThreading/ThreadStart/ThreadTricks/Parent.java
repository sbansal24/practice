package MultiThreading.ThreadStart.ThreadTricks;

public class Parent {
    private int i = 10;
    private static int j = 90;
    public void method1() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " has entered method1.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " has outed method1.");
    }
    public void method2() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " has entered method2.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " has outed method2.");
    }
    public synchronized void method3() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " has entered method3.");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " has outed method3.");
    }

    public synchronized void method4() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " has entered method4.");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " has outed method4.");
    }

    public synchronized static void method5() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " has entered method5.");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " has outed method5.");
    }

    public synchronized static void method6() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " has entered method6.");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " has outed method6.");
    }

    public Number test(int i){
        return 10;
    }

}
