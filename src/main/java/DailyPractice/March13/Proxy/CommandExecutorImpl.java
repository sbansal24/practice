package DailyPractice.March13.Proxy;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void processCommand(String command) {
        System.out.println("running the command " + command);
    }
}
