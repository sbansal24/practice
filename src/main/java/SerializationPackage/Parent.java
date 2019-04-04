package SerializationPackage;

import java.io.IOException;
import java.io.Serializable;

public class Parent implements Serializable{
    private static final long serialVersionUID  = 10L;
    private int i = 90;

//    public Parent(int i) {
//        System.out.println("in parameterized parent constructor");
//        this.i = i;
//    }

    public Parent() {
        System.out.println("in default parent constructor");
//        this.i = 50;
    }

    public int getI() {
        return i;
    }

    protected  Number test() throws IOException {
        return 10;
    }
}
