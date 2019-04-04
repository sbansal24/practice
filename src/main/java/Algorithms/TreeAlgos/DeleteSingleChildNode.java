package Algorithms.TreeAlgos;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteSingleChildNode {
    Node root;

    void printInorder(Node node) {
        if (node != null) {
            printInorder(node.left);
            System.out.print(node.data + " ");
            printInorder(node.right);
        }
    }

    void mirror(Node node) {
        if (node == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        ((LinkedList<Node>) queue).push(node);
        while (!queue.isEmpty()) {
            Node ptr = ((LinkedList<Node>) queue).getFirst();
            ((LinkedList<Node>) queue).pop();
            Node temp = ptr.left;
            ptr.left = ptr.right;
            ptr.right = temp;
            if (ptr.left != null) {
                ((LinkedList<Node>) queue).push(ptr.left);
            }
            if (ptr.right != null) {
                ((LinkedList<Node>) queue).push(ptr.right);
            }
        }
    }

    Node removeHalfNodes(Node node) {
        if (node == null) {
            return null;
        }

        node.left = removeHalfNodes(node.left);
        node.right = removeHalfNodes(node.right);
        if (node.left == null && node.right == null) {
            return node;
        }

        if (node.left == null) {
            Node newNode = node.right;
            return newNode;
        }
        if (node.right == null) {
            Node newNode = node.left;
            return newNode;
        }
        return node;
    }

    public static void main(String[] args) {
        DeleteSingleChildNode tree = new DeleteSingleChildNode();
        tree.root = new Node(2);
        tree.root.left = new Node(7);
        tree.root.right = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(1);
        tree.root.left.right.right = new Node(11);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(4);

        System.out.println("inorder traversal is....");
        tree.printInorder(tree.root);

//        Node newRoot = tree.removeHalfNodes(tree.root);
        tree.mirror(tree.root);
        System.out.println();
        System.out.println("*************");
        tree.printInorder(tree.root);

    }
}
