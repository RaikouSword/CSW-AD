package ass5;

public class q2{
    public static void main(String args[]){
        String original = "Hello";
        String modified = original.concat(" World");
        System.out.println("Origianl String: "+original);
        System.out.println("Memory address of original: "+System.identityHashCode(original));
        System.out.println("Modified String: "+modified);
        System.out.println("Memory address of modified: "+System.identityHashCode(modified));
        original = "Laugh";
        System.out.println("Original String after reassign: "+original);
        System.out.println("Memory after Original: "+System.identityHashCode(original));
        CharSequence charSequence = "Java is magic!";
        System.out.println("Length of charSequence: "+charSequence.length());
        System.out.println("Character at index 4: "+charSequence.charAt(4));
        System.out.println("Subsequence from index 5 to 10: "+charSequence.subSequence(5, 10));
    }
}
