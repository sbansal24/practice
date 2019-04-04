package DesignPatterns.Strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount +" has been paid through creditCard");
    }
}
