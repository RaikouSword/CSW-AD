package ass5;

import java.io.File;
import java.util.Scanner;

public class q13 {
    public static void main(String[] a) {
        System.out.print("Enter file name to delete: ");
        File f = new File(new Scanner(System.in).nextLine());
        System.out.println(f.exists() && f.delete() ? "File deleted." : "File not found.");
    }
}

