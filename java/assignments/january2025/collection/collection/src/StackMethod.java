import java.util.EmptyStackException;

public class StackMethod <E>{
    private ArrayListMethod<E> arrayList;

    public StackMethod(){
        arrayList = new ArrayListMethod<>();
    }

    public int size(){
        return arrayList.size();
    }

    public boolean isEmpty() {
        if(size() == 0) return true;
        return false;
    }

    public void push(E item) {
        arrayList.add(item);
    }

    public Object pop() {
        if(size() == 0) throw new EmptyStackException();
        Object toRemove = arrayList.get(size()-1);
        arrayList.remove(size()-1);
        return toRemove;
    }

    public Object peek() {
        if(size() == 0) throw new EmptyStackException();
        return arrayList.get(size()-1);
    }

    public int search(E item2) {
        int index = -1;
        for(int i = 0; i < size() - 1; i++) {
            if(arrayList.get(i).equals(item2)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
