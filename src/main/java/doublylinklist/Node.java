package doublylinklist;

public class Node<K> {
    private K key;
    private Node prev;
    private Node next;

    public Node(K key){
        this.key = key;
        this.prev = null;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
