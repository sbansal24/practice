package binarysearchtree;


public class BinarySearchTreeTest {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(30);
        treeMap.put(78);
        treeMap.put(12);
        treeMap.put(10);
        treeMap.put(40);

        treeMap.inorderTraversal();

        System.out.println("*************");
        treeMap.postOrderTraversal();
        System.out.println("*****************");
        treeMap.levelOrderTraversal();

        System.out.println("**************************");
//        treeMap.levelOrderTraversalUsingQueue();
//        treeMap.leftViewOfTree();
//        treeMap.rightViewOfTree();

    }
}
