package ass3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class q9 {
    public static void main(String[] args) {
        int userInput = readIntegerFromUser();
        System.out.println("You entered: " + userInput);
    }

    public static int readIntegerFromUser() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        
        try {
            System.out.print("Enter an integer: ");
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
        
        return number;
    }
}

