package ass5;

import java.io.File;
import java.util.Scanner;

public class q12 {
    public static void main(String[] a) {
        System.out.print("Enter directory path: ");
        File dir = new File(new Scanner(System.in).nextLine());
        if (!dir.exists() || !dir.isDirectory()) { System.out.println("Invalid directory."); return; }
        for (String f : dir.list()) System.out.println(f);
    }
}

