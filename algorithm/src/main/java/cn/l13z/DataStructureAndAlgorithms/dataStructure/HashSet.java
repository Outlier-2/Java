package cn.l13z.DataStructureAndAlgorithms.dataStructure;

import java.util.HashMap;

public class HashSet<K> {
    private static final Object PRESENT = new Object();

    private final HashMap<K, Object> map = new HashMap<>();

    public void add(K key) {
        map.put(key, PRESENT);
    }

    public void remove(K key) {
        map.remove(key);
    }

    public boolean contains(K key) {
        return map.containsKey(key);
    }

    public int size() {
        return map.size();
    }
}
