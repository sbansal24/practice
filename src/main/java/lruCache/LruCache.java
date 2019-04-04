package lruCache;

import java.util.HashMap;

public class LruCache<K> {
    private final int capacity;
    HashMap<K, Node> hashMap = new HashMap<>();
    Node previous = null;
    Node next = null;

    public LruCache(int capacity) {
        this.capacity = capacity;
    }

    public <V> void add(K key, V value){
        if(hashMap.containsKey(key)){

        } else {
            Node node = new Node(key, value);
            hashMap.put(key, node);
        }

    }
}
