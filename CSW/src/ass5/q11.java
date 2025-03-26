package ass5;

import java.io.*;
import java.util.*;

public class q11 {
    public static void main(String[] a) throws IOException {
        File f = new File("diary.txt");
        if (!f.exists()) { System.out.println("File not found."); return; }
        System.out.print("Enter new diary entry: ");
        String entry = new Scanner(System.in).nextLine();
        try (FileWriter w = new FileWriter(f, true)) {
            w.write("\n" + new Date() + "\n" + entry);
            System.out.println("Entry added.");
        }
    }
}

