import java.util.Scanner;

public class q1 {

    public static void leftShift(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void rightShift(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of positions to shift (k): ");
        int k = sc.nextInt();
        System.out.print("Enter the direction (left or right): ");
        String direction = sc.next();

        if (direction.equalsIgnoreCase("left")) {
            leftShift(arr, k);
            System.out.println("Array after shifting left by " + k + " positions:");
        } else if (direction.equalsIgnoreCase("right")) {
            rightShift(arr, k);
            System.out.println("Array after shifting right by " + k + " positions:");
        } else {
            System.out.println("Invalid direction input. Please enter 'left' or 'right'.");
            return;
        }

        printArray(arr);
        sc.close();
    }
}
