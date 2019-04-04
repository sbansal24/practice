package DesignPatterns.Bridge;

public class TraingleShape extends Shape {

    public TraingleShape(Color color) {
        super(color);
    }

    @Override
    public void drawShape() {
        System.out.println("Traingle filled with color");
        color.drawColor();
    }
}
