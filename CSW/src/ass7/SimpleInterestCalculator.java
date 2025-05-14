package ass7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SimpleInterestCalculator {
    private static final double ANNUAL_INTEREST_RATE = 0.08; // 8%

    /**
     * Main method to run the program.
     *
     * @param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate startDate = getStartDate(scanner);
        double initialAmount = getInitialAmount(scanner);
        calculateAndDisplayInterest(startDate, initialAmount);

        scanner.close(); 
    }

    /**
     * Gets the start date from the user, with input validation.
     *
     * @param scanner Scanner object to read user input
     * @return LocalDate object representing the start date
     */
    private static LocalDate getStartDate(Scanner scanner) {
        LocalDate startDate = null;
        boolean validDate = false;
        String dateString;
        do {
            System.out.print("Enter the start date (YYYY-MM-DD): ");
            dateString = scanner.nextLine();
            try {
                startDate = LocalDate.parse(dateString);
                validDate = true;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
            }
        } while (!validDate);
        return startDate;
    }

    /**
     * Gets the initial amount from the user, with input validation.
     *
     * @param scanner Scanner object to read user input
     * @return the initial amount as a double
     */
    private static double getInitialAmount(Scanner scanner) {
        double initialAmount = 0;
        boolean validAmount = false;
        do {
            System.out.print("Enter the initial amount: ");
            try {
                initialAmount = Double.parseDouble(scanner.nextLine());
                if (initialAmount > 0) {
                    validAmount = true;
                } else {
                    System.out.println("Initial amount must be greater than zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Please enter a valid number.");
            }
        } while (!validAmount);
        return initialAmount;
    }

    /**
     * Calculates the simple interest and displays the result.
     *
     * @param startDate     the start date of the investment
     * @param initialAmount the initial amount of the investment
     */
    private static void calculateAndDisplayInterest(LocalDate startDate, double initialAmount) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the number of days between the start date and the current date
        long days = ChronoUnit.DAYS.between(startDate, currentDate);

        // Calculate the simple interest
        double interest = initialAmount * ANNUAL_INTEREST_RATE * days / 365.0;

        // Calculate the total amount
        double totalAmount = initialAmount + interest;

        // Display the result
        System.out.println("Start Date: " + startDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println("Current Date: " + currentDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println("Number of days: " + days);
        System.out.printf("Interest: %.2f%n", interest); // Use printf for formatted output.
        System.out.printf("Total Amount: %.2f%n", totalAmount);
    }
}

