package DesignPatterns.Decorator;

public class LuxuryCar extends CarDecorator {
    LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void buildCar(){
        super.buildCar();
        System.out.println("adding feature of luxury car");
    }
}
