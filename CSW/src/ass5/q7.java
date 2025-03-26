package ass5;

import java.util.Scanner;

public class q7 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print("Sentence: ");
        String st = s.nextLine(), w1 = s.next(), w2 = s.next();
        int i = st.indexOf(w1);
        System.out.println("Modified: " + (i != -1 ? st.substring(0, i) + w2 + st.substring(i + w1.length()) : st));
        s.close();
    }
}
