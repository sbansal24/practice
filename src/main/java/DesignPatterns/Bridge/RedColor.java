package DesignPatterns.Bridge;

public class RedColor implements Color {
    @Override
    public void drawColor() {
        System.out.println("draw with red color");
    }
}
