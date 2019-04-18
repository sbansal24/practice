package CallHierarchie;

public class ClassA {
    static {
        System.out.println("classA static block");
    }

    {
        System.out.println("classA block");
    }

    public ClassA() {
        System.out.println("class A no argument condtructor");
    }
    public ClassA(int a) {
        System.out.println("class A parametrized condtructor");
    }

}
