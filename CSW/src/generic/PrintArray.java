package generic;

public class PrintArray {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        printArray(intArray);

        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println("String Array:");
        printArray(strArray);

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double Array:");
        printArray(doubleArray);
    }
}

