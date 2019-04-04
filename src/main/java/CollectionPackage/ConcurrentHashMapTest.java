package CollectionPackage;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>(10, .7f,8);
        chm.put("abc", "xyz");
        chm.remove("abc");
        chm.get("abc");
    }
}
