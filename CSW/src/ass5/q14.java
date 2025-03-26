package ass5;

import java.io.*;
import java.util.Scanner;

public class q14 {
    public static void main(String[] a) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter source file: ");
        File src = new File(s.nextLine());
        if (!src.exists()) { System.out.println("Source file not found."); return; }
        
        System.out.print("Enter destination file: ");
        File dest = new File(s.nextLine());
        if (dest.exists()) {
            System.out.print("File exists. Overwrite? (y/n): ");
            if (!s.next().equalsIgnoreCase("y")) return;
        }

        try (FileInputStream in = new FileInputStream(src); FileOutputStream out = new FileOutputStream(dest)) {
            out.write(in.readAllBytes());
            System.out.println("File copied.");
        }
    }
}

