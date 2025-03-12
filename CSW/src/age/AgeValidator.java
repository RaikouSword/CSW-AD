package age;

import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            if (age < 18) {
                UnderAgeException underAge = new UnderAgeException();
                throw underAge;
            } else if (age > 65) {
                OverAgeException overAge = new OverAgeException();
                throw overAge;
            } else {
                System.out.println("Your age is valid. Welcome!");
            }
        } catch (UnderAgeException e) {
            System.out.println("Error: " + e.message());
        } catch (OverAgeException e) {
            System.out.println("Error: " + e.message());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            scanner.close();
        }
    }
}

