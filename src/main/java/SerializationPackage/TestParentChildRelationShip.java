package SerializationPackage;

import java.io.*;

public class TestParentChildRelationShip {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Child child = new Child(10, 20);
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("ser.txt")));
//        oos.writeObject(child);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("ser.txt")));
        Child child1 = (Child) ois.readObject();
        System.out.println(child1.getI());
        System.out.println(child1.getJ());

    }
}
