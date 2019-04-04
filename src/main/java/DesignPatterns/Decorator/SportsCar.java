package DesignPatterns.Decorator;

public class SportsCar extends CarDecorator {

    SportsCar(Car car) {
        super(car);
    }

    @Override
    public void buildCar() {
        super.buildCar();
        System.out.println("adding feature of sports car");
    }
}
