package DailyPractice.March25.CommandPattern;

public class OpenFileCommand implements Command {
    private final FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
fileSystemReceiver.openFile();
    }
}
