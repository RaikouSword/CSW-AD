package ass2_2;

import java.util.HashSet;

public class q9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 5}; 
        findRepeatingIntegers(numbers);
    }

    public static void findRepeatingIntegers(int[] numbers) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        HashSet<Integer> repeatingNumbers = new HashSet<>();

        for (int num : numbers) {
            if (!seenNumbers.add(num)) {
                repeatingNumbers.add(num);
            }
        }

        if (repeatingNumbers.isEmpty()) {
            System.out.println("No repeating integers.");
        } else {
            System.out.println("Repeating integers: " + repeatingNumbers);
        }
    }
}

