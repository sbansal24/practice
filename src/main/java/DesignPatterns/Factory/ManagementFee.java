package DesignPatterns.Factory;

public class ManagementFee implements NavEvent {
    @Override
    public void execute() {
        System.out.println("executing Management Fee Nav Event");
    }
}
