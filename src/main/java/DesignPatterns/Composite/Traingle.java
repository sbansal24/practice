package DesignPatterns.Composite;

public class Traingle implements Shape {
    @Override
    public void draw(String fillColors) {
        System.out.println("Drawing Traingle with color "+fillColors);
    }
}
