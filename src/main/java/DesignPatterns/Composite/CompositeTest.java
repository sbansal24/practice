package DesignPatterns.Composite;

public class CompositeTest {
    public static void main(String[] args) {
        Traingle t1  = new Traingle();
        Circle c1 = new Circle();

        Drawing d1 = new Drawing();
        d1.add(t1);
        d1.add(c1);

        d1.draw("blue");
    }
}
