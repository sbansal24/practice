package DesignPatterns.Observer;

public class StockExchangeSubscriber implements Observer {
    private final User user;
    private Subject subject;

    public StockExchangeSubscriber(User user) {
        this.user = user;
    }

    @Override
    public void update() {
        String message = (String) subject.getUpdate(this);
        if (message == null) {
            System.out.println(user.getUserName() + ":: no new message");
        } else {
            System.out.println(user.getUserName() + ":: consuming message on stock message :: " + message);
        }

    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
