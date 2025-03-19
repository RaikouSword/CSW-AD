package generic;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);
        System.out.println("Integer Box contains: " + intBox.getValue());

        Box<String> strBox = new Box<>("Hello");
        System.out.println("String Box contains: " + strBox.getValue());
    }
}

