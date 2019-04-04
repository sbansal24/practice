package DesignPatterns.Factory;

public class IncentiveFee implements NavEvent {
    @Override
    public void execute() {
        System.out.println("executing Incentive Fee Nav Event");
    }
}
