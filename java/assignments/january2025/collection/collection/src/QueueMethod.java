public class QueueMethod <E>{
    private int head;
    private final ArrayMethod<E> array;
    private int size;


    public QueueMethod() {
        array = new ArrayMethod<>();
        this.head = 0;
        this.size = 0;
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public boolean offer(E firstElement) {
        if(!array.isFull()) {
            array.add(firstElement);
            return true;
        }else {
            return false;
        }
    }

    public int size() {
        return array.size();
    }

    public Object peek() {
        return array.get(head);
    }

    public Object poll() {
        if (array.size() == 0) return null;

        Object frontElement = array.get(head);
        array.remove(head);

        return frontElement;
    }

    public Object getHead(){
        return array.get(head);
    }

    public Object remove() {
        Object frontElement = poll();
        return frontElement;
    }

    public Object element() {
        if (array.size() == 0) return null;
        Object frontElement = peek();
        return frontElement;
    }

}
