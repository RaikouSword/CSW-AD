package ass3;

import java.util.Arrays;

public class q6 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2, 7, 6};

        try {
            System.out.println("Original Array: " + Arrays.toString(numbers));
            Arrays.sort(numbers);
            System.out.println("Sorted Array: " + Arrays.toString(numbers));

            int target = 8;
            int index = Arrays.binarySearch(numbers, target);
            if (index >= 0) {
                System.out.println("Element " + target + " found at index: " + index);
            } else {
                System.out.println("Element " + target + " not found.");
            }

            System.out.println("Element at index 3: " + numbers[3]);
            System.out.println("Element at index 7: " + numbers[7]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index outside the bounds of the array.");
        }

        System.out.println("Program continues running after exception handling.");
    }
}

