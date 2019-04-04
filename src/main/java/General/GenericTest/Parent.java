package General.GenericTest;

public class Parent {
    static {
        System.out.println("In parent static block");
    }
    {
        System.out.println("in parent normal block");
    }

    Parent(){
        System.out.println("in Parent constructor");
    }
    Parent(Object obj){
        System.out.println(" in parent paramettrized constructor");
    }
}
