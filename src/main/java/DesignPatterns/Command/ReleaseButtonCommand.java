package DesignPatterns.Command;

public class ReleaseButtonCommand implements Command {
    private final CommandReceiver commandReceiver;

    public ReleaseButtonCommand(CommandReceiver commandReceiver) {
        this.commandReceiver = commandReceiver;
    }

    @Override
    public void execute() {
        this.commandReceiver.releaseButton();
    }
}
