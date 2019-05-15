package OOPSConcept.DynamicLoading;

public class GrandChild extends Child {
    static {
        System.out.println("in the grandchild static code");
    }
    {
        System.out.println("in the grand child block code");
    }
    public GrandChild(){
        System.out.println("in the grand child class constructor");
    }

    public GrandChild(int i){
        System.out.println("in the grand child class  parametrized constructor");
    }
}
