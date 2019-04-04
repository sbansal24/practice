package doublylinklist;

public class DoublyList<T> {
    Node head ;

    public DoublyList(){
        head = null;
    }

    public void add(T value){
        Node node = new Node(value);
        if(head == null){
            head = node;
        } else {
            Node ptr = head;
            while(ptr.getNext() != null){
                ptr = ptr.getNext();
            }
            node.setPrev(ptr);
            ptr.setNext(node);
        }
    }

    public void traverseList(){
        if(head == null){
            return;
        }
        Node ptr = head;
        while(ptr != null){
            System.out.println(ptr.getKey());
            ptr = ptr.getNext();
        }
    }

    public void deleteNode(T value){
        if(head == null){
            return;
        }
        Node ptr = head;
        while(ptr!= null){
            if(value.equals(ptr.getKey()))
                break;
            ptr = ptr.getNext();
        }
        if(ptr!= null){
            if (ptr.getNext() == null){
                ptr.getPrev().setNext(null);
            } else if(ptr.getPrev() == null ){
                ptr.getNext().setPrev(null);
                head = ptr.getNext();
            } else {
                ptr.getPrev().setNext(ptr.getNext());
                ptr.getNext().setPrev(ptr.getPrev());
            }
        }
    }

    public void insertAfter(T value, T finder){
        Node node = new Node(value);
        if(head == null){
            head = node;
            return;
        }
        Node ptr = head;
        Node prev = null;
        while(ptr != null){
            if(finder.equals(ptr.getKey()))
                break;
            prev = ptr;
            ptr = ptr.getNext();
        }
        if (ptr == null){
            prev.setNext(node);
            node.setPrev(prev);
        } else if(ptr.getNext() == null){
            ptr.setNext(node);
            node.setPrev(ptr);
        } else {
            ptr.getNext().setPrev(node);
            node.setNext(ptr.getNext());
            ptr.setNext(node);
            node.setPrev(ptr);
        }

    }
}
