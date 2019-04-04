package Polymorphism;

import java.io.IOException;

public class Parent {
    protected int x = 10;

    Parent() throws IOException {
       // x = 80;

            throw new IOException();

    }

    public void print() {
        x = 90;
        System.out.println("in the parent class");
    }
}
