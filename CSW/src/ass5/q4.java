package ass5;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial string: ");
        StringBuilder text = new StringBuilder(sc.nextLine());

        while (true) {
            System.out.println("\nText Manipulation Menu:");
            System.out.println("1. Add substring at a position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a position");
            System.out.println("4. Concatenate another string");
            System.out.println("5. Display current string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter substring to add: ");
                    String substring = sc.nextLine();
                    System.out.print("Enter position to insert at: ");
                    int insertPos = sc.nextInt();
                    if (insertPos >= 0 && insertPos <= text.length()) {
                        text.insert(insertPos, substring);
                        displayText(text);
                    } else {
                        System.out.println("Invalid position!");
                    }
                    break;

                case 2:
                    System.out.print("Enter start index to remove: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index to remove: ");
                    int end = sc.nextInt();
                    if (start >= 0 && end <= text.length() && start < end) {
                        text.delete(start, end);
                        displayText(text);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;

                case 3:
                    System.out.print("Enter index to modify: ");
                    int modifyIndex = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    if (modifyIndex >= 0 && modifyIndex < text.length()) {
                        System.out.print("Enter new character: ");
                        char newChar = sc.nextLine().charAt(0);
                        text.setCharAt(modifyIndex, newChar);
                        displayText(text);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.print("Enter string to concatenate: ");
                    String concatStr = sc.nextLine();
                    text.append(concatStr);
                    displayText(text);
                    break;

                case 5:
                    displayText(text);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }

    private static void displayText(StringBuilder text) {
        System.out.println("Updated String: " + text);
        System.out.println("Length: " + text.length() + ", Capacity: " + text.capacity());
    }
}

