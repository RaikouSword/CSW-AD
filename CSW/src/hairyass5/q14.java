package hairyass5;
import java.io.*;
import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source file path:");
        String srcFilePath = scanner.nextLine();
        File srcFile = new File(srcFilePath);

        if (!srcFile.exists() || !srcFile.isFile()) {
            System.out.println("Source file does not exist or is not a valid file");
            return;
        }

        System.out.println("Enter the destination file path:");
        String destFilePath = scanner.nextLine();
        File destFile = new File(destFilePath);

        if (destFile.exists()) {
            System.out.println("Destination file already exists. Overwrite? (yes/no)");
            String overwrite = scanner.nextLine();
            if (!overwrite.equalsIgnoreCase("yes")) {
                System.out.println("File copy cancelled.");
                return;
            }
        }

        try (FileReader in = new FileReader(srcFile);
        	FileWriter out = new FileWriter(destFile)) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File content copied successfully");
        } catch (IOException e) {
            System.err.println("Error occurred while copying file content: " + e.getMessage());
        }
    }
}
