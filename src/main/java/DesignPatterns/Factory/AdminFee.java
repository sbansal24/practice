package DesignPatterns.Factory;

public class AdminFee implements NavEvent {
    @Override
    public void execute() {
        System.out.println("executing Admin Fee Nav Event");
    }
}
