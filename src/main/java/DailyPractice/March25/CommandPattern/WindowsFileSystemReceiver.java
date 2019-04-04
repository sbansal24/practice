package DailyPractice.March25.CommandPattern;

public class WindowsFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("opening file on window");
    }

    @Override
    public void closeFile() {
        System.out.println("closing file on window");
    }
}
