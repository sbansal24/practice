package DailyPractice.March25.CommandPattern;

public class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("opening file on unix system");
    }

    @Override
    public void closeFile() {
        System.out.println("closing file on unix system");
    }
}
