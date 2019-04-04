package DailyPractice.March11.Strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void makePayment() {
        System.out.println("payment is through credit card");
    }
}
