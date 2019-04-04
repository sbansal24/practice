package binarysearchtree;

import java.util.Objects;

public class Node<T extends Comparable<T>> {
    private T  data;
    private Node left;
    private Node right;

    public Node(T data){
        this.data = data;
        left = null;
        right = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data) &&
                Objects.equals(left, node.left) &&
                Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, left, right);
    }
}
