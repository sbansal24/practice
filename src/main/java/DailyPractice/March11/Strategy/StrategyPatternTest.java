package DailyPractice.March11.Strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.makePayment(new CreditCardPayment());
        System.out.println("*****************");
        shoppingCart.makePayment(new OnlinePayment());
    }
}
