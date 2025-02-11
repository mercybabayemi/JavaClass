package linkedlist;

public class LinkedListMethod<E> {

    private LinkedListMethod<E> linkedLists;
    private Node head;
    private Node tail;

    public LinkedListMethod() {
        head = null;
        tail = null;
        linkedLists = new LinkedListMethod<>();
    }

    public LinkedListMethod(LinkedListMethod<E> linkedLists) {
        this.linkedLists = linkedLists;
        head = null;
        tail = null;
    }


    public boolean isEmpty() {
        return false;
    }
}
