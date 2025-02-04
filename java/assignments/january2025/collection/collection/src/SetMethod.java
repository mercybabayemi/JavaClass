import java.util.InputMismatchException;

public class SetMethod <E>{
    private ArrayListMethod<E> list = new ArrayListMethod<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(E firstExample) {
        if (list.isEmpty()) list.add(firstExample);
        else if (!contains(firstExample)) list.add(firstExample);
        else if (contains(firstExample)) throw new InputMismatchException("Duplicate entry");
    }

    public int size() {
        return list.size();
    }

    public void remove(E secondExample) {
        list.remove(secondExample);
    }

    public void clear() {
        list.clear();
    }

    public boolean contains(E firstExample) {
        if(list.contains(firstExample)) return true;
        return false;
    }
}
