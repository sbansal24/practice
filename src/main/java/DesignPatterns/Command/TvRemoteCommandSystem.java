package DesignPatterns.Command;

public class TvRemoteCommandSystem implements CommandReceiver {
    @Override
    public void pressButton() {
        System.out.println("TV remote button pressed.");
    }

    @Override
    public void releaseButton() {
        System.out.println("TV remote button released.");
    }
}
