package DesignPatterns.Command;

public class PressButtonCommand implements Command {
    private final CommandReceiver commandReceiver;

    public PressButtonCommand(CommandReceiver commandReceiver) {
        this.commandReceiver = commandReceiver;
    }

    @Override
    public void execute() {
        System.out.println("request for command press has been raised from receiver");
        this.commandReceiver.pressButton();
    }
}
