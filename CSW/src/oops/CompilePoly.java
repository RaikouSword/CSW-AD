package oops;
class Calcul {
    static int Multiply(int a, int b) {
        return a * b;
    }

    static double Multiply(double a, double b) {
        return a * b;
    }

    static int Multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class CompilePoly {
    public static void main(String[] args) {
        System.out.println(Calcul.Multiply(2, 4));
        System.out.println(Calcul.Multiply(10, 6.3));
        System.out.println(Calcul.Multiply(5, 6, 2));
    }
}
