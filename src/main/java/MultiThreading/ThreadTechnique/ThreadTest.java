package MultiThreading.ThreadTechnique;

public class ThreadTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass childClass = new ChildClass();
        Thread t1 = new Thread(()->{
            try {
                myClass.method1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()->{
            try {
                childClass.method2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }
}
