package ass8;

import java.util.Scanner;

class AdditionThread extends Thread {
    int num1, num2;

    AdditionThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run() {
        int result = num1 + num2;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
    }
}

class SubtractionThread extends Thread {
    int num1, num2;

    SubtractionThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run() {
        int result = num1 - num2;
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);
    }
}

class MultiplicationThread extends Thread {
    int num1, num2;

    MultiplicationThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run() {
        int result = num1 * num2;
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
    }
}

class DivisionThread extends Thread {
    int num1, num2;

    DivisionThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run() {
        if (num2 != 0) {
            double result = (double) num1 / num2;
            System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter two numbers for arithmetic operations:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        AdditionThread addThread = new AdditionThread(num1, num2);
        SubtractionThread subThread = new SubtractionThread(num1, num2);
        MultiplicationThread mulThread = new MultiplicationThread(num1, num2);
        DivisionThread divThread = new DivisionThread(num1, num2);

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();
    }
}

