package generic;

public class ArrayMerger {

    // Generic method to merge two arrays
    public static <T> T[] mergeArrays(T[] array1, T[] array2) {
        // Create a new array to hold the merged elements
        T[] mergedArray = (T[]) new Object[array1.length + array2.length];
        
        // Copy the elements from the first array
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        
        // Copy the elements from the second array
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        
        return mergedArray;
    }

    public static void main(String[] args) {
        // Example usage with Integer arrays
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {4, 5, 6};
        
        Integer[] merged = mergeArrays(array1, array2);
        
        // Print merged array
        for (Integer num : merged) {
            System.out.print(num + " ");
        }
    }
}




