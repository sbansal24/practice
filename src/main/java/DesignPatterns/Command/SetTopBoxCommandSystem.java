package DesignPatterns.Command;

public class SetTopBoxCommandSystem implements CommandReceiver {
    @Override
    public void pressButton() {
        System.out.println("Set Top Box remote button pressed.");
    }

    @Override
    public void releaseButton() {
        System.out.println("Set Top Box remote button released.");
    }
}
