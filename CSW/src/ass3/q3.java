package ass3;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numeric value:");
        String input = scanner.nextLine();
        
        int result = convertToInteger(input);
        if (result != -1) {
            System.out.println("Converted integer: " + result);
        }
    }
    
    public static int convertToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric value.");
            return -1;
        }
    }
}

