package DailyPractice.March11.Strategy;

public class ShoppingCart {
    public void makePayment(PaymentStrategy paymentStrategy){
        paymentStrategy.makePayment();
    }
}
