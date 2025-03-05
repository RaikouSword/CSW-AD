package ass2_2;

import java.util.HashMap;

public class q10 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 2, 6, 5}; 

        int missingNumber = findSmallestMissingPositive(numbers);
        
        System.out.println("The smallest positive number missing is: " + missingNumber);
    }

    public static int findSmallestMissingPositive(int[] numbers) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        for (int num : numbers) {
            numberMap.put(num, 1);
        }

        for (int i = 1; i <= 10; i++) {
            if (!numberMap.containsKey(i)) {
                return i;  
            }
        }
        return 11;
    }
}

