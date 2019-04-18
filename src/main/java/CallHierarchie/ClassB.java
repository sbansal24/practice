package CallHierarchie;

public class ClassB extends ClassA {
    static {
        System.out.println("classB static block");
    }

    {
        System.out.println("classB block");
    }

    public ClassB() {
        System.out.println("class B no argument condtructor");
    }
    public ClassB(int a) {
        System.out.println("class B parametrized condtructor");
    }
}
