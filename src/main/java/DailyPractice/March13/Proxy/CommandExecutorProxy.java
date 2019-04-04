package DailyPractice.March13.Proxy;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String role) {
        if (role.equals("admin")) {
            isAdmin = true;
        }
        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void processCommand(String command) {
        if (isAdmin) {
            commandExecutor.processCommand(command);
        } else {
            if (command.contains("rm")) {
                throw new RuntimeException("remove is the command");
            } else {
                commandExecutor.processCommand(command);
            }
        }
    }
}
