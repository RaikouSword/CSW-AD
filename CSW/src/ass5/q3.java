package ass5;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer text = new StringBuffer();
        
        while (true) {
            System.out.println("\n--- Simple Text Editor ---");
            System.out.println("1. Append Text");
            System.out.println("2. Insert Text");
            System.out.println("3. Delete Text");
            System.out.println("4. Reverse Text");
            System.out.println("5. Replace Text");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    text.append(appendText);
                    break;
                
                case 2:
                    System.out.print("Enter text to insert: ");
                    String insertText = scanner.nextLine();
                    System.out.print("Enter index: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (insertIndex >= 0 && insertIndex <= text.length()) {
                        text.insert(insertIndex, insertText);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                
                case 3:
                    System.out.print("Enter start index: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter end index: ");
                    int endIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (startIndex >= 0 && endIndex <= text.length() && startIndex < endIndex) {
                        text.delete(startIndex, endIndex);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                
                case 4:
                    text.reverse();
                    break;
                
                case 5:
                    System.out.print("Enter start index: ");
                    int replaceStart = scanner.nextInt();
                    System.out.print("Enter end index: ");
                    int replaceEnd = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter replacement text: ");
                    String replaceText = scanner.nextLine();
                    if (replaceStart >= 0 && replaceEnd <= text.length() && replaceStart < replaceEnd) {
                        text.replace(replaceStart, replaceEnd, replaceText);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
            System.out.println("Current Text: " + text);
            System.out.println("Length: " + text.length() + ", Capacity: " + text.capacity());
        }
    }
}


