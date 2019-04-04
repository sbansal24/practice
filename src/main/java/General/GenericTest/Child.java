package General.GenericTest;

public class Child extends Parent {
    static {
        System.out.println("In child static block");
    }
    {
        System.out.println("in child normal block");
    }

    Child(){
        System.out.println("in child constructor");
    }

    Child(Object obj){
//        super(obj);
        System.out.println(" in child paramettrized constructor");
    }
}
