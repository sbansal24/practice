package Polymorphism;

import java.io.IOException;

public class Child extends Parent {
    protected int x = 20;

    public Child() throws IOException {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("exception catch");
        }
        throw new IOException();
    }

    public void print() {
        System.out.println("in the child class");
    }
}
