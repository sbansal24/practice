package DesignPatterns.Command;

public class CommandPatternTest {
    public static void main(String[] args) {
        CommandReceiver commandReceiver = CommandUtil.getCommandReceiver(RemoteType.TV);
        Command pressButtonCommand = new PressButtonCommand(commandReceiver);
        CommandInvoker commandInvoker = new CommandInvoker(pressButtonCommand);
        commandInvoker.execute();

        Command releaseButtonCommand = new ReleaseButtonCommand(commandReceiver);
        CommandInvoker commandInvoker1 = new CommandInvoker(releaseButtonCommand);
        commandInvoker1.execute();

    }
}
