package ass2_2;

import java.util.Scanner;
import java.util.TreeSet;

public class q6 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        System.out.println("Elements in the TreeSet: " + numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it exists in the TreeSet: ");
        int numberToCheck = scanner.nextInt();

        if (numbers.contains(numberToCheck)) {
            System.out.println("The number " + numberToCheck + " is present in the TreeSet.");
        } else {
            System.out.println("The number " + numberToCheck + " is not present in the TreeSet.");
        }

        System.out.print("Enter a number to remove from the TreeSet: ");
        int numberToRemove = scanner.nextInt();

        if (numbers.remove(numberToRemove)) {
            System.out.println("The number " + numberToRemove + " was removed from the TreeSet.");
        } else {
            System.out.println("The number " + numberToRemove + " was not found in the TreeSet.");
        }

        System.out.println("Elements in the TreeSet after removal: " + numbers);

        scanner.close();
    }
}
