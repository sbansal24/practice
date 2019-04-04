package DesignPatterns.Bridge;

public class GreenColor implements Color {
    @Override
    public void drawColor() {
        System.out.println("Draw with green color");
    }
}
