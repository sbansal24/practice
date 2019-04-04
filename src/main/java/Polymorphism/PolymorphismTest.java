package Polymorphism;

import java.io.IOException;

public class PolymorphismTest {
    public static void main(String[] args) throws IOException {
        Parent parent = new Child();
        System.out.println(parent.x);
        parent.print();

    }
}
