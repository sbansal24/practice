package customhashmap;

public class CustomHashMap<K,V> {
    private Entry<K,V>[] table;
    int INITIAL_CAPACITY = 4;

    public CustomHashMap(){
        table = new Entry[INITIAL_CAPACITY];
    }

    public void put(K key, V value){
        if(key == null){
            return;
        }
        int hash = hash(key);
    }

    private int hash(K key){
        return Math.abs(key.hashCode()) & INITIAL_CAPACITY;
    }
}
