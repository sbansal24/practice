package lruCache;

public class Node<K, V> {
    private K key;
    private V value;
    private Node previous;
    private Node next;

    public Node(K key, V value){
        this.key = key;
        this.value = value;
    }
}
