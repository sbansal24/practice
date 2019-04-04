package DesignPatterns.Decorator;

public abstract class CarDecorator implements Car {
    Car car;

    CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void buildCar() {
        car.buildCar();
    }
}
