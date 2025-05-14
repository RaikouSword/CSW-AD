package ass8;

import java.util.Scanner;

public class CalculatorWithLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter two numbers for arithmetic operations:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Runnable addTask = () -> {
            int result = num1 + num2;
            System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
        };

        Runnable subTask = () -> {
            int result = num1 - num2;
            System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);
        };

        Runnable mulTask = () -> {
            int result = num1 * num2;
            System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
        };

        Runnable divTask = () -> {
            if (num2 != 0) {
                double result = (double) num1 / num2;
                System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        };

        Thread addThread = new Thread(addTask);
        Thread subThread = new Thread(subTask);
        Thread mulThread = new Thread(mulTask);
        Thread divThread = new Thread(divTask);

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();
    }
}
