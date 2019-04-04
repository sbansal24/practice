package General;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fis = new FileInputStream("file.txt")){

        }
    }
}
