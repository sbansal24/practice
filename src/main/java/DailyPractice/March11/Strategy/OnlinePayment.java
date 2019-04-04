package DailyPractice.March11.Strategy;

public class OnlinePayment implements PaymentStrategy {
    @Override
    public void makePayment() {
        System.out.println("making payment online");
    }
}
