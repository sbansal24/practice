package ThreeThreadCommunication;

import java.util.Stack;

public class IntegerStack extends Stack<Integer> {
    public IntegerStack(int capacity) {
        super();
    }

    public Integer push(Integer value) {
        super.push((Integer)value);
        return value;
    }
}
