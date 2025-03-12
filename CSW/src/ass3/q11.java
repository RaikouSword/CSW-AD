package ass3;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class q11 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file path as a command-line argument.");
            return;
        }

        String filePath = args[0];
        try {
            processFile(filePath);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void processFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new IOException("The file does not exist: " + filePath);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new IOException("Error reading the file: " + filePath, e);
        }
    }
}
