package linkListOperation;

public class ListUtils {
    public static Node reverseLinkedList(Node currentNode)
    {
        // For first node, previousNode will be null
        Node previousNode=null;
        Node nextNode;
        while(currentNode!=null)
        {
            nextNode=currentNode.getNext();
            // reversing the link
            currentNode.setNext(previousNode);
            // moving currentNode and previousNode by 1 node
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }
}
