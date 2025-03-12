package ass3;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class q8 {
    public static void main(String[] args) {
        try {
            checkNumber(-1);
        } catch (CustomCheckedException e) {
            System.out.println("Caught CustomCheckedException: " + e.getMessage());
        }
    }

    public static void checkNumber(int number) throws CustomCheckedException {
        if (number < 0) {
            throw new CustomCheckedException("Number cannot be negative.");
        }
        System.out.println("The number is: " + number);
    }
}

