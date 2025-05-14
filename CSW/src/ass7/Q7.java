package ass7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate.toString());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.WEEK_OF_YEAR, 2); 
        Date twoWeeksFromNow = calendar.getTime();
        System.out.println("Date 2 weeks from today: " + twoWeeksFromNow.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = sdf.format(currentDate);
        System.out.println("Formatted Current Date: " + formattedDate);
    }
}
