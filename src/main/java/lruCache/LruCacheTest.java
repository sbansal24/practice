package lruCache;

public class LruCacheTest {
    public static void main(String[] args) {
        LruCacheImpl<String, String> cache = new LruCacheImpl<>(5);
        cache.addElement("abc", "xyz");
        System.out.println(cache.getElement("abc"));
    }
}
