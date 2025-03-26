package ass5;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        String upperStr1 = str1.toUpperCase();
        String upperStr2 = str2.toUpperCase();
        boolean areEqual = lowerStr1.equals(lowerStr2);
        System.out.println("\nConverted Strings:");
        System.out.println("Lowercase:");
        System.out.println("String 1: " + lowerStr1);
        System.out.println("String 2: " + lowerStr2);
        
        System.out.println("\nUppercase:");
        System.out.println("String 1: " + upperStr1);
        System.out.println("String 2: " + upperStr2);
        
        System.out.println("\nCase-Insensitive Comparison: " + (areEqual ? "Equal" : "Not Equal"));

        sc.close();
    }
}

