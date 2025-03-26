package ass5;

import java.io.*;
import java.util.Scanner;

public class q10 {
    public static void main(String[] a) {
        File f = new File("diary.txt");
        if (!f.exists()) { System.out.println("File not found."); return; }
        try (Scanner s = new Scanner(f)) {
            while (s.hasNextLine()) System.out.println(s.nextLine());
        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }
}

