package DesignPatterns.Bridge;

public class BridgePatternTest {
    public static void main(String[] args) {
        Shape traingle = new TraingleShape(new RedColor());
        Shape square = new SquareShape(new GreenColor());
        traingle.drawShape();
        square.drawShape();
    }
}
