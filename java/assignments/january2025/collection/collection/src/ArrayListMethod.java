import java.util.InputMismatchException;

public class ArrayListMethod<E> {
    private final int capacity = 3;
    private Object[] array = new Object[capacity];
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E firstExample) {
        if (firstExample == null) throw new NullPointerException("Argument cannot be null");
        if(isFull()) increaseCapacity();
        this.array[size++] = firstExample;
    }

    private void increaseCapacity() {
        Object[] newArray = new Object[capacity*2];
        for(int i = 0; i < capacity; i++) newArray[i] = array[i];

        array = newArray;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void add(int index, E secondExample) {
        if (secondExample == null) throw new NullPointerException("Argument cannot be null");
        if(index < 0 || index > size - 1) throw new IndexOutOfBoundsException("Index must be between 0 and " + (size - 1));
        if(isFull()) increaseCapacity();
        size++;
        for(int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        this.array[index] = secondExample;
    }

    public void remove(E thirdElement){
        int expectedIndex = -1;

        for(int index = 0; index < size ; index++) if (thirdElement.equals(array[index])) expectedIndex = index;

        if(expectedIndex == -1) throw new InputMismatchException("Element not found!");

        for(int index = expectedIndex ; index < size - 1 ; index++) array[index] = array[index + 1];

        size--;
    }

    public Object get(int index) {
        if(index < 0 || index > size - 1) throw new IndexOutOfBoundsException("Index must be between 0 and " + (size - 1));
        return array[index];
    }

    public void set(int index, E setExample) {
        if(index < 0 || index > size - 1) throw new IndexOutOfBoundsException("Index must be between 0 and " + (size - 1));
        if(index > 0 && index <= size - 1) array[index] = setExample;
    }

    public boolean contains(E secondExample) {
        for(int i = 0; i < size; i++) {
            if(secondExample.equals(array[i])) return true;
        }
        return false;
    }


    public void clear() {
        size = 0;
    }

    public void remove(int input ) {
        int expectedIndex = -1;

        for(int index = 0; index < size ; index++) if (input == index) expectedIndex = index;

        if(expectedIndex == -1) throw new IndexOutOfBoundsException("Element not found!");

        for(int index = expectedIndex ; index < size - 1 ; index++) array[index] = array[index + 1];

        array[size - 1] = null;

        size--;
    }

    public void removeAll() {
        for (int i = array.length - 1; i >= 0; i--) remove(i);
        size = 0;
    }

}
