package DesignPatterns.Strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Item item = new Item("abc", 60);
        Item item1 = new Item("abc1", 30);
        Item item2 = new Item("abc2", 90);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(item);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new CreditCardPayment());

        shoppingCart.pay(new NetBankingPayment());

    }
}
