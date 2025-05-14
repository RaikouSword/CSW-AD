package ass7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the start date (YYYY-MM-DD): ");
        LocalDate startDate = LocalDate.parse(sc.nextLine());
        System.out.print("Enter the end date (YYYY-MM-DD): ");
        LocalDate endDate = LocalDate.parse(sc.nextLine());
        System.out.println("No of Days between two dates is: " + ChronoUnit.DAYS.between(startDate, endDate));
    
    }
}
