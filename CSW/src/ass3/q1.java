package ass3;

import java.util.Scanner;

public class q1 {
	public static void numericAfterVowel(String s) {
		if(s.charAt(0) >= 48 && s.charAt(0) <= 57) {
			System.out.print(s.charAt(0));
		}
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) >= 48 && s.charAt(i) <= 57 && (s.charAt(i - 1) == 'a' || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'i' || s.charAt(i - 1) == 'o' || s.charAt(i - 1) == 'u') && !(s.charAt(i - 2) == 'a' || s.charAt(i - 2) == 'e' || s.charAt(i - 2) == 'i' || s.charAt(i - 2) == 'o' || s.charAt(i - 2) == 'u')) {
				System.out.print(s.charAt(i));
			}
		}
	}
	public static void main(String[] args) throws NullPointerException{
		try {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			numericAfterVowel(s);
			sc.close();
		} catch(NullPointerException e) {
			System.out.println("The String is null");
		}
	}
}



