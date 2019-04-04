package binarysearchtree;

import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class TreeMap {
    private Node root;

    public TreeMap() {
        root = null;
    }

    public <T extends Comparable<T>> void put(T data) {
        root = insertRecursivly(root, data);

    }

    private <T extends Comparable<T>> Node insertRecursivly(Node root, T data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data.compareTo((T) root.getData()) < 0) {
            root.setLeft(insertRecursivly(root.getLeft(), data));
        } else {
            root.setRight(insertRecursivly(root.getRight(), data));
        }
        return root;
    }

    private static int MAX_LEVEL;

    public void leftViewOfTree() {
        MAX_LEVEL = 0;
        leftView(root, 1);
    }

    private void leftView(Node node, int level) {
        if (node == null) {
            return;
        }
        if (MAX_LEVEL < level) {
            System.out.println(node.getData());
            MAX_LEVEL = level;
        }

        leftView(node.getLeft(), level + 1);
        leftView(node.getRight(), level + 1);
    }

    public void rightViewOfTree(){
        MAX_LEVEL = 0;
        rightView(root, 1);
    }

    private void rightView(Node node, int level) {
        if(node == null){
            return;
        }
        if(MAX_LEVEL<level){
            System.out.println(node.getData());
            MAX_LEVEL = level;
        }

        rightView(node.getRight(), level+1);
        rightView(node.getLeft(), level+1);
    }

    public void levelOrderTraversalUsingQueue() {
        Queue<Node> queue = new LinkedTransferQueue<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.println(tempNode.getData());
            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }
            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }
        }
    }

    public void levelOrderTraversal() {
        int height = getHeight(root);
        System.out.println("height of tree is "+height);
        for (int i = 1; i <= height; i++) {
//            printLevelOrder(root, i);
            printRightLevelOrder(root,i);
        }
    }

    private void printLevelOrder(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.println(root.getData());
        } else if (level > 1) {
            printLevelOrder(root.getLeft(), level - 1);
            printLevelOrder(root.getRight(), level - 1);
        }
    }

    private void printRightLevelOrder(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.println(root.getData());
        } else if (level > 1) {
            printLevelOrder(root.getRight(), level - 1);
            printLevelOrder(root.getLeft(), level - 1);
        }
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = getHeight(node.getLeft());
            int rightHeight = getHeight(node.getRight());

            if (leftHeight > rightHeight) {
                return leftHeight + 1;
            } else {
                return rightHeight + 1;
            }
        }
    }

    public void inorderTraversal() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.println(root.getData());
            inOrder(root.getRight());
        }
    }

    public void postOrderTraversal() {
        postOrder(root);
    }

    private void postOrder(Node root) {
        if (root != null) {
            postOrder(root.getRight());
            System.out.println(root.getData());
            postOrder(root.getLeft());
        }
    }

    public <T extends Comparable<T>> void delete(T data) {
        if (root == null) {
            return;
        }

        Node ptr = findNode(data);
        if (ptr == null) {
            return;
        }
        if (ptr.getLeft() == null || ptr.getRight() == null) {

        }
    }

    private <T extends Comparable<T>> Node findNode(T data) {
        Node ptr = root;
        while (ptr != null) {
            if (ptr.getData() == data) {
                break;
            }
            if (data.compareTo((T) ptr.getLeft().getData()) < 0) {
                ptr = ptr.getLeft();
            } else {
                ptr = ptr.getRight();
            }
        }
        return ptr;
    }
}
