package DesignPatterns.Decorator;

public class BasicCar implements Car {
    @Override
    public void buildCar() {
        System.out.println("building the basic car");
    }
}
