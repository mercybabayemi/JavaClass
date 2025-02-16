public class LinkedListMethod<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public static class Node<E> {
        private Node<E> next;
        private Node<E> prev;
        private E data;

        public Node(E data) {
            this.next = null;
            this.data = data;
            this.prev = null;
        }
    }

    public LinkedListMethod() {
        head = null;
        tail = null;
    }


    public boolean isEmpty() {
        if(head == null) return true;
        return false;
    }

    public void add(E data) {
        Node<E> newNode = new Node<>(data);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        this.size ++;
    }

    public int size() {
        return size;
    }

    public void remove(E data) {
        if(isEmpty()) throw new NullPointerException("Linkedlist is empty");

        Node<E> current = head;
        while (current != null) {
            if(current.data.equals(data)){
                if(current.prev != null){
                    current.prev.next = current.next;
                } else{
                    head = current.next;
                }
                if(current.next != null){
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                size --;
                return;
            }
            current = current.next;
        }
    }
}
