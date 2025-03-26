package ass5;

import java.io.File;
import java.util.Scanner;

public class q15 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter current file name: ");
        File oldFile = new File(s.nextLine());
        if (!oldFile.exists()) { System.out.println("File not found."); return; }

        System.out.print("Enter new file name: ");
        File newFile = new File(s.nextLine());
        System.out.println(oldFile.renameTo(newFile) ? "File renamed." : "Rename failed.");
    }
}

