package DailyPractice.March25.CommandPattern;

public class CommandPatternTest {
    public static void main(String[] args) {
        FileSystemReceiver receiver = new WindowsFileSystemReceiver();
        Command openFileCommand = new OpenFileCommand(receiver);
        FileSystemInvoker invoker = new FileSystemInvoker(openFileCommand);
        invoker.invoke();

        Command closeFileCommand = new CloseFileCommand(receiver);
        invoker = new FileSystemInvoker(closeFileCommand);
        invoker.invoke();
    }
}
