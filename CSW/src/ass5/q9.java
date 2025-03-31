package ass5;

import java.io.*;
import java.util.*;

public class q9 {
    public static void main(String[] a) throws IOException {
        File f = new File("diary.txt");
        if (f.exists()) { System.out.println("File already exists."); return; }
        System.out.print("Enter diary entry: ");
        String entry = new Scanner(System.in).nextLine();
        try (FileWriter w = new FileWriter(f)) {
            w.write(new Date() + "\n" + entry);
            System.out.println("Diary saved.");
        }
        
    }
}