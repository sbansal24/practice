package Polymorphism;

import PCWitlLockApi.AbstarctClass;

public class AbstarctInterfaceTest extends AbstarctClass {
    public static void main(String[] args) {
        AbstarctClass abstarctClass = new AbstarctInterfaceTest();
       ((AbstarctInterfaceTest) abstarctClass).test1();
        abstarctClass.test();

    }

    @Override
    public void test() {
        System.out.println("concrete class test method");
    }

    public void test1(){
        System.out.println("concrete class test1");
    }
}
