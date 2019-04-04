package DesignPatterns.Decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.buildCar();

        Car SportsLuxury = new SportsCar(new LuxuryCar(new BasicCar()));
        SportsLuxury.buildCar();
    }
}
