package cn.l13z.DataStructureAndAlgorithms.dataStructure;

public class HashMap<K, V> {
    private Object[] table;

    public void put(K key, V value) {
        int index = hash(key);
        table[index] = value;
    }

    public V get(K key) {
        int index = hash(key);
        return (V) table[index];
    }

    public void remove(K key) {
        int index = hash(key);
        table[index] = null;
    }

    // 自己设计
    private int hash(K key) {
        for (int i = 0; i < table.length; i++) {
            // hash =  int (table[i]) * 2^31;
        }
        return 1;
    }
}