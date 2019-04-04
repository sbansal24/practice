package DesignPatterns.Strategy;

public class NetBankingPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount +" has been paid through Net Banking");
    }
}
