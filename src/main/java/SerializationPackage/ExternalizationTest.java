package SerializationPackage;

import java.io.*;

public class ExternalizationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.setUserId("abca");
        user.setPassword("test");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.ser"));
        oos.writeObject(user);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.ser"));
         user =  (User)ois.readObject();
         ois.close();

        System.out.println(user.getUserId());
        System.out.println(user.getPassword());
    }
}
