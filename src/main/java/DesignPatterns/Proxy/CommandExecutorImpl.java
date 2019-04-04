package DesignPatterns.Proxy;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void executeCommand(String command) {
        System.out.println("executing the command "+ command);
    }
}
