package linkListOperation;

public class SinglyList<T> {
    Node head;

    SinglyList() {
        head = null;
    }

    public void traverse() {
        if (head == null) {
            return;
        }
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.getKey() + " ");
            ptr = ptr.getNext();
        }
        System.out.println();
    }

    public boolean add(T value){
        Node node = new Node(value);
        if(head == null){
            head = node;
        } else{
            Node ptr = head;
            while(ptr.getNext() != null){
                ptr = ptr.getNext();
            }
            ptr.setNext(node);
        }
        return true;
    }

    public void reverse() {
        Node prev = null, current, next;
        if(head == null){
            return ;
        }
        current = head;
        while(current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }

    public T findNthElement(int n) {
        if(head == null){
            return null;
        }
        Node ptr = head;
        int i =0;
        while(i<n){
            ptr = ptr.getNext();
            i++;
        }
        Node current = head;
        while(ptr!=null){
            ptr = ptr.getNext();
            current = current.getNext();
        }
        return (T) current.getKey();
    }
}
