package Assignments.Collection;

import java.util.InputMismatchException;

public class SetMethod {
    private ArrayListMethod list = new ArrayListMethod();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(String firstExample) {
        if (list.isEmpty()) list.add(firstExample);
        else if (!contains(firstExample)) list.add(firstExample);
        else if (contains(firstExample)) throw new InputMismatchException("Duplicate entry");
    }

    public int size() {
        return list.size();
    }

    public void remove(String secondExample) {
        list.remove(secondExample);
    }

    public void clear() {
        list.clear();
    }

    public boolean contains(String firstExample) {
        if(list.contains(firstExample)) return true;
        return false;
    }
}

