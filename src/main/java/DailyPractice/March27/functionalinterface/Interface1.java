package DailyPractice.March27.functionalinterface;

@FunctionalInterface
public interface Interface1 {
    void method1();
    default void method2(){
        System.out.println("default interface1 method");
    }
}
