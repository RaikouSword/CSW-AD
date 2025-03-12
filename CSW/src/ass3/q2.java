package ass3;

class CustomNullPointerException extends Exception {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class q2 {
    public static void main(String[] args) {
        String input = null;
        try {
            if (input == null) {
                throw new CustomNullPointerException("Custom Error: Input string is null.");
            }
            System.out.println(input.length());
        } catch (CustomNullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

