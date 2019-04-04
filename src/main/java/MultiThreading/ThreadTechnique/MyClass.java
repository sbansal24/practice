package MultiThreading.ThreadTechnique;

public class MyClass {
    public synchronized void method1() throws InterruptedException {
        System.out.println("in method1");
        Thread.sleep(500);
        System.out.println("out method1");
    }

    public synchronized void method2() throws InterruptedException {
        System.out.println("in method2");
        Thread.sleep(500);
        System.out.println("out method2");
    }
}
