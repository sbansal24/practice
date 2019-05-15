package OOPSConcept.DynamicLoading;

public class Parent {
    static {
        System.out.println("in the parent static code");
    }

    {
        System.out.println("in the parent block code");
    }
    public Parent(){
        System.out.println("in the parent class constructor");
    }
}
