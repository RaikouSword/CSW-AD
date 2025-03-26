package ass5;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class q16 {
    public static void main(String[] a) {
        System.out.print("Enter file name: ");
        File f = new File(new Scanner(System.in).nextLine());
        if (!f.exists()) { System.out.println("File not found."); return; }
        System.out.println("Size: " + f.length() + " bytes");
        System.out.println("Last Modified: " + new Date(f.lastModified()));
        System.out.println("Readable: " + f.canRead() + ", Writable: " + f.canWrite() + ", Executable: " + f.canExecute());
    }
}

