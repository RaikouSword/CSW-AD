

import java.util.Scanner;

public class q1 {
    public static void numericAfterVowel(String s) {
        if (s == null || s.isEmpty()) {
            throw new NullPointerException("Input string is null or empty.");
        }

        if (s.charAt(0) >= 48 && s.charAt(0) <= 57) {
            System.out.print(s.charAt(0));
        }
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57 && 
                (s.charAt(i - 1) == 'a' || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'i' || s.charAt(i - 1) == 'o' || s.charAt(i - 1) == 'u') && 
                !(s.charAt(i - 2) == 'a' || s.charAt(i - 2) == 'e' || s.charAt(i - 2) == 'i' || s.charAt(i - 2) == 'o' || s.charAt(i - 2) == 'u')) {
                System.out.print(s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        try {
            numericAfterVowel(s);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}
