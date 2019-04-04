package DailyPractice.March13.Proxy;

public class ProxtDesignPatternTest {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutorProxy("test");
        commandExecutor.processCommand("div");
        commandExecutor.processCommand("rm file");
    }
}
