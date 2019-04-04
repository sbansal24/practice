package CollectionPackage;

import java.util.LinkedList;

public class ListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("abc");
        list.add(2,"xyz");
        System.out.println(list);
    }
}
