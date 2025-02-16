import java.util.Iterator;

public class MapMethod <K,V>{

    private SetMethod<K> keys;
    private ArrayListMethod<V> values;


    public MapMethod(){
        this.keys = new SetMethod<>();
        this.values = new ArrayListMethod<>();
    }


    public boolean isEmpty() {
        return keys.isEmpty() && values.isEmpty();
    }

    public int size() {
        return keys.size() & values.size();
    }

    public void put(K key, V value) {
        keys.add(key);
        values.add(value);
    }


    public boolean containsValue(V value) {
        if(values.contains(value)) return true;
        return false;
    }

    public boolean containsKey(K key) {
        if(keys.contains(key)) return true;
        return false;
    }

    public Object get(K key) {
        int expectedIndex = -1;
        int index = 0;
        Iterator<K> iterator = keys.iterator();
        while (iterator.hasNext()) {
            K k = iterator.next();
            if (k.equals(key)) {
                expectedIndex = index;
                break;
            }
            index++;
        }
        if (expectedIndex != -1) return values.get(expectedIndex);
        else return null;
    }

    public V remove(K first) {
        int expectedIndex = -1;
        int index = 0;
        K keyToRemove = null;
        Iterator<K> iterator = keys.iterator();
        while (iterator.hasNext()) {
            K k = iterator.next();
            if (k.equals(first)) {
                expectedIndex = index;
                keyToRemove = k;
                break;
            }
            index++;
        }
        V valueToReturn = null;
        if (expectedIndex != -1){
            valueToReturn = (V) values.get(expectedIndex);
            values.remove(valueToReturn);
            keys.remove(keyToRemove);
        }
        return valueToReturn;
    }

    public void clear() {
        keys.clear();
        values.clear();
    }
}
