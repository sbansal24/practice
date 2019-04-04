package DesignPatterns.Proxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        CommandExecutor adminProxy = new CommandExecutorProxy("admin");
        adminProxy.executeCommand("hello");

        CommandExecutorProxy userProxy = new CommandExecutorProxy("user");
        try{
            userProxy.executeCommand("hi");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
