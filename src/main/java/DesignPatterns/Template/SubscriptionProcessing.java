package DesignPatterns.Template;

public class SubscriptionProcessing extends  BaseTemplate{
    @Override
    public void filter(){
        System.out.println("subscription processing filter");
    }

    @Override
    public void postTransaction() {
        System.out.println("subscription posting");
    }
}
