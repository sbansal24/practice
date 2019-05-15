package OOPSConcept.DynamicLoading;

public class Child extends Parent {
    static {
        System.out.println("in the child static code");
    }
    {
        System.out.println("in the child block code");
    }

    public Child(){
        System.out.println("in the child class constructor");
    }
}
