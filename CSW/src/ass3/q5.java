package ass3;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                try {
                    int result = 10 / number;
                    System.out.println("The result of 10 divided by " + number + " is: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Cannot divide by zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format. Please enter a valid integer.");
            }
        } finally {
            scanner.close();
        }
    }
}

