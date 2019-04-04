package DailyPractice.March25.CommandPattern;

public class FileSystemInvoker {
    private final Command command;

    public FileSystemInvoker(Command command) {
        this.command = command;
    }
    public void invoke(){
        command.execute();
    }
}
