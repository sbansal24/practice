package SerializationPackage;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address();
        address.setAddress("address1");

        Person person = new Person();
        person.setPersonId(1);
        person.setPersonName("person1");
        person.setAddress(address);

        ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream(new File("test.ser")));
        oos.writeObject(person);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("test.ser")));
        Person person1 = (Person) ois.readObject();
        System.out.println(person1.getPersonId());
        System.out.println(person1.getPersonName());
        System.out.println(person1.getAddress());
    }
}
