package ass3;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            
            if (number < 0) {
                throw new ArithmeticException("Cannot calculate the square root of a negative number.");
            }
            
            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is: " + squareRoot);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

