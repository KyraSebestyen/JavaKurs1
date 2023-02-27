import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K,V> {
    private List<Pair<K, V>> keyValuePairs = new ArrayList<>();

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.keyValuePairs.size());
        if (this.keyValuePairs.get(hashValue) == null) {
            return null;
        }

        for (Pair<K, V> pair : keyValuePairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        Pair<K,V> pair = new Pair<>(key, value);
        int hashValue = Math.abs(key.hashCode() % keyValuePairs.size());
        if (keyValuePairs.get(hashValue) == null || !keyValuePairs.contains(pair)) {
            keyValuePairs.add(pair);
        }
    }

    public V remove(K key) {
        int hashValue = Math.abs(key.hashCode() % keyValuePairs.size());
        V toRemove = keyValuePairs.get(hashValue).getValue();
        keyValuePairs.remove(hashValue);
        return toRemove;
    }
}
