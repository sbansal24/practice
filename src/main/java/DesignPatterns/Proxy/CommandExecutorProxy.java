package DesignPatterns.Proxy;

public class CommandExecutorProxy implements CommandExecutor {
    private CommandExecutor commandExecutor;
    private boolean isAdmin;

    CommandExecutorProxy(String user){
        if("admin".equals(user))
            isAdmin = true;
        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void executeCommand(String command) {
        if(isAdmin){
            commandExecutor.executeCommand(command);
        } else{
            throw new RuntimeException("wrong user");
        }
    }
}
