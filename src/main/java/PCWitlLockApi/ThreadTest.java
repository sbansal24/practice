package PCWitlLockApi;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadTest extends AbstarctClass {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread th = new Thread(t);
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        th.start();
//        th.start();
        int i = 1;
        switch (i){
            default:
                System.out.println("default");
                break;
            case 5:
                System.out.println("hi");
//                break;
            case 10:
                System.out.println("hello");
                break;
            case 11:
                System.out.println("xyz");

        }
    }



    @Override
    public void test() {

    }
}
