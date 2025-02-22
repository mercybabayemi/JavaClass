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

    public boolean add(E firstElement) {
        if(!array.isFull()) {
            array.add(firstElement);
            return true;
        }
        else if(array.isFull()) throw new IllegalStateException("Queue is full");
        if(firstElement == null) throw new NullPointerException("Element is null");
        if(!firstElement.equals(getClass())) throw new ClassCastException();
        throw new IllegalArgumentException("Not allowed to add element");
    }

    public int size() {
        return array.size();
    }

    public Object peek() {
        return array.get(head);
    }

    public Object poll() {
        if (array.isEmpty()) return null;
        Object frontElement = array.get(head);
        array.remove(head);
        return frontElement;
    }

    public Object remove() {
        return poll();
    }

    public Object element() {
        if (array.isEmpty()) return null;
        return peek();
    }
}
