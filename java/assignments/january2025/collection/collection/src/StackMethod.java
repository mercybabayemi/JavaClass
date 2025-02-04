public class StackMethod <E>{
    private ArrayListMethod<E> arrayList;

    public int size(){
        return arrayList.size();
    }

    public boolean isEmpty() {
        return false;
    }
}
