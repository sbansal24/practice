package DesignPatterns.Composite;

public class Circle implements Shape {
    @Override
    public void draw(String fillColors) {
        System.out.println("Drawing Circle with color "+fillColors);
    }
}
