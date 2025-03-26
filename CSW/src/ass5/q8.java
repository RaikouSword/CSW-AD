package ass5;

import java.util.Scanner;

public class q8 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();
        while (true) {
            System.out.println("1. Lowercase 2. Uppercase 3. Search 4. Concatenate 5. Exit");
            switch (s.nextInt()) {
                case 1 -> System.out.println(str.toLowerCase());
                case 2 -> System.out.println(str.toUpperCase());
                case 3 -> System.out.println("Index: " + str.indexOf(s.next().charAt(0)));
                case 4 -> System.out.println(str + s.next());
                case 5 -> { s.close(); return; }
            }
        }
    }
}


