package DesignPatterns.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void removeItem(Item item) {
        this.itemList.remove(item);
    }

    public int getTotal() {
        return itemList.stream().map(e -> e.getPrice()).reduce(0, (a, b) -> a + b);
    }

    public void pay(PaymentStrategy paymentStrategy){
        int totalAmount = getTotal();
        paymentStrategy.pay(totalAmount);
    }
}
