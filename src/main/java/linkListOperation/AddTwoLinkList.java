package linkListOperation;

public class AddTwoLinkList {
    public static void main(String[] args) {
        SinglyList<Integer> list = new SinglyList<>();
        list.add(1);
        list.add(4);
        list.add(5);

        list.traverse();
        Node node1 = ListUtils.reverseLinkedList(list.head);
        System.out.println("***********");
        System.out.println(node1.getKey());
        System.out.println("");
        SinglyList<Integer> list1 = new SinglyList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list1.traverse();


    }
}
