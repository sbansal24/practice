package linkListOperation;

public class SinglyListTest {
    public static void main(String[] args) {
        SinglyList<Integer> list = new SinglyList<>();
        list.add(40);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.traverse();

//     list.reverse();
        System.out.println("-----------------------");
     list.traverse();
        System.out.println();
    Integer data =  list.findNthElement(4);
        System.out.println(data);



    }


}
