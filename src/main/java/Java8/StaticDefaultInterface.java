package Java8;

public interface StaticDefaultInterface {
    static void staticMethod(){
        System.out.println("static Method");
    }

    default void defaultMethod(){
        System.out.println("default method");
    }
}
