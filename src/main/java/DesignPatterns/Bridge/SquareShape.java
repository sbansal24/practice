package DesignPatterns.Bridge;

public class SquareShape extends Shape {
    public SquareShape(Color color) {
        super(color);
    }

    @Override
    public void drawShape() {
        System.out.println("Square shape is drawing...");
        color.drawColor();
    }
}
