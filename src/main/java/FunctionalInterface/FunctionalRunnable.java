package FunctionalInterface;

@FunctionalInterface
interface FunctionalRunnable {
    void test();

    default void testOne(){
        System.out.println("interface method.");
    }
    default void testOne1(){
        System.out.println("interface method.");
    }
    default void testOne2(){
        System.out.println("interface method.");
    }

}
