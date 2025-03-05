package ass2_2;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
}

public class q1 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        Pair<String, String> pair2 = new Pair<>("Name", "Alice");
        Pair<Integer, Double> pair3 = new Pair<>(2, 3.14);

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }
}
