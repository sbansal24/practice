package SerializationPackage;

import java.io.Serializable;

public class Child extends Parent implements Serializable {
    private static final long serialVersionUID  = 1L;
    private int j = 50;

    public Child(int i, int j) {
//        super(i);
        System.out.println("in parameterized child constructor");
//        this.i = i;
        this.j = j;
    }
    public Child(){
        System.out.println("in default child constructor");
        j = 60;
    }

    public int getJ() {
        return j;
    }

    public Float test() {
        return 10.0f;
    }
}
