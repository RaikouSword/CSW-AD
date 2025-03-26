package ass5;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to character array
        char[] charArray = input.toCharArray();
        
        // Display character array
        System.out.print("Character Array: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // Input character to search
        System.out.print("Enter a character to search: ");
        char searchChar = sc.next().charAt(0);

        // Find first and last occurrences
        int firstIndex = input.indexOf(searchChar);
        int lastIndex = input.lastIndexOf(searchChar);

        // Display results
        if (firstIndex == -1) {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        } else {
            System.out.println("First occurrence at index: " + firstIndex);
            System.out.println("Last occurrence at index: " + lastIndex);
        }

        sc.close();
    }
}

