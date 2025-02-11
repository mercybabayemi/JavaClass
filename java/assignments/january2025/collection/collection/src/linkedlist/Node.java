package linkedlist;

public class Node {
    private Node next;
    private Node prev;
    private int data;

    public Node(int data,  Node next, Node prev) {
        this.next = next;
        this.data = data;
        this.prev = prev;
    }

}
