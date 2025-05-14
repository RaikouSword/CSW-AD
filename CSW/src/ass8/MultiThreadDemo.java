package ass8;

import java.util.Scanner;

class SumThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               System.out.print(e);
            }
        }
        System.out.println("Sum of first 100 natural numbers: " + sum);
    }
}

class MultiplicationThread extends Thread {
    int number;

    MultiplicationThread(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = scanner.nextInt();

        SumThread sumThread = new SumThread();
        MultiplicationThread multiplicationThread = new MultiplicationThread(num);

        sumThread.start();
        multiplicationThread.start();
    }
}
