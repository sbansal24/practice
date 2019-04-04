package DesignPatterns.Observer;

public class ObserverDesignPatternTest {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();
        User user1 = new User(1, "user1");
        User user2 = new User(2, "user2");
        User user3 = new User(3, "user3");
        User user4 = new User(4, "user4");

        Observer observer1 = new StockExchangeSubscriber(user1);
        Observer observer2 = new StockExchangeSubscriber(user2);
        Observer observer3 = new StockExchangeSubscriber(user3);
        Observer observer4 = new StockExchangeSubscriber(user4);

        stockExchange.register(observer1);
        stockExchange.register(observer2);
        stockExchange.register(observer3);
        stockExchange.register(observer4);

        observer1.setSubject(stockExchange);
        observer2.setSubject(stockExchange);
        observer3.setSubject(stockExchange);
        observer4.setSubject(stockExchange);

        observer1.update();
        stockExchange.postMessage("message posted");



    }
}
