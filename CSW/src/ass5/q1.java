package ass5;

public class q1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println("Memory address of s1: "+System.identityHashCode(s1));
        System.out.println("Memory address of s2: "+System.identityHashCode(s2));
        System.out.println("Memory address of s3: "+System.identityHashCode(s3));
        System.out.println("Memory address of s4: "+System.identityHashCode(s4));
        System.out.println("Comparison between s1 and s2: "+ (s1==s2));
        System.out.println("Comparison between s1 and s3: "+ (s1==s3));
        System.out.println("Comparison between s3 and s4: "+ (s3==s4));
        System.out.println("Comparison between s1 and s3(content): "+ s1.equals(s3));
        System.out.println("Comparison between s3 and s4(content): "+ s3.equals(s4));
    }
}
