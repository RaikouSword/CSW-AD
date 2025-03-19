package generic;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "apple");
        System.out.println("First: " + pair1.getFirst() + ", Second: " + pair1.getSecond());

        pair1.setFirst(2);
        pair1.setSecond("banana");
        System.out.println("After modification - First: " + pair1.getFirst() + ", Second: " + pair1.getSecond());

        Pair<Double, Boolean> pair2 = new Pair<>(3.14, true);
        System.out.println("First: " + pair2.getFirst() + ", Second: " + pair2.getSecond());
    }
}

