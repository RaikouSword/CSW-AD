package hairyass5;
import java.io.*;
import java.text.SimpleDateFormat;

import java.util.*;

public class q11 {
    public static void main(String[] a) {
        File f = new File("diary.txt");

        try (Scanner scanner = new Scanner(System.in)) {
            // If the file doesn't exist, create it
            if (!f.exists()) {
                f.createNewFile();
                System.out.println("File created: diary.txt");
            }

            System.out.print("Enter new diary entry: ");
            String entry = scanner.nextLine();

            // Format the current timestamp
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

            // Append the entry with timestamp
            try (FileWriter writer = new FileWriter(f, true)) {
                writer.write("\n" + timestamp + "\n" + entry);
                System.out.println("Entry added.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}