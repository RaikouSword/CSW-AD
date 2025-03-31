package hairyass5;

import java.io.File;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Use scanner to read user input
        try {
            System.out.print("Enter directory path: ");
            String dirPath = scanner.nextLine();  // Read the directory path
            File dir = new File(dirPath);  // Create File object

            // Check if the directory exists and is a directory
            if (!dir.exists()) {
                System.out.println("Directory does not exist.");
            } else if (!dir.isDirectory()) {
                System.out.println("The provided path is not a directory.");
            } else {
                // Get and list files and subdirectories in the directory
                String[] fileList = dir.list();
                if (fileList == null) {
                    System.out.println("An error occurred while accessing the directory.");
                } else if (fileList.length == 0) {
                    System.out.println("The directory is empty.");
                } else {
                    System.out.println("Files and subdirectories in " + dirPath + ":");
                    for (String fileName : fileList) {
                        File file = new File(dir, fileName);
                        System.out.println((file.isDirectory() ? "Directory: " : "File: ") + fileName);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();  // Always close the scanner
        }
    }
}
