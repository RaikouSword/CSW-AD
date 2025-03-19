package generic;

public class Swap {
    
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before Swap: " + intArray[1] + " and " + intArray[3]);
        swap(intArray, 1, 3);
        System.out.println("After Swap: " + intArray[1] + " and " + intArray[3]);
        
        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println("Before Swap: " + strArray[0] + " and " + strArray[2]);
        swap(strArray, 0, 2);
        System.out.println("After Swap: " + strArray[0] + " and " + strArray[2]);
    }
}