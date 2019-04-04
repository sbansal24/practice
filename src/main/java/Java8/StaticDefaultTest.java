package Java8;

import java.util.Collections;

public class StaticDefaultTest implements StaticDefaultInterface {
    public static void main(String[] args) {
        StaticDefaultInterface.staticMethod();
        StaticDefaultInterface staticDefaultTest = new StaticDefaultTest();
        staticDefaultTest.defaultMethod();
        StaticDefaultTest.staticMethod();

        String str = "hello";
        String str1 = new String("hello");
        System.out.println(str == str1);
//        Collections.singletonList()
    }

    @Override
    public void defaultMethod() {
        System.out.println("default method main");
    }

    static void staticMethod() {
        System.out.println("static Method in main");
    }
}
