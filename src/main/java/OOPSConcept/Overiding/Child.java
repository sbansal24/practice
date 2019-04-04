package OOPSConcept.Overiding;

import java.io.IOException;

public class Child extends Parent{

    @Override
    public Integer test(int i) throws IOException {
        return 10;
    }
}
