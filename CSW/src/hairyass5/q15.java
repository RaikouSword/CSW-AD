package hairyass5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
public class q15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the current file name:");
            String currentFileName = scanner.nextLine().trim();
            File oldFile = new File(currentFileName);

            if (!oldFile.exists()) {
                throw new FileNotFoundException("Error: The file " + currentFileName + " does not exist.");
            }

            System.out.println("Enter the new file name:");
            String newFileName = scanner.nextLine().trim();
            File newFile = new File(newFileName);

            if (newFile.exists()) {
                throw new IOException("Error: A file with the name " + newFileName + " already exists.");
            }

            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed from " + currentFileName + " to " + newFileName + ".");
            } else {
                throw new IOException("Error: Unable to rename file.");
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
        
    }
}
