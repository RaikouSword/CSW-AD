import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LTime {

    public static void main(String[] args) {

        LocalTime whatIsTheTime = LocalTime.now();
        System.out.println(whatIsTheTime);

        LocalTime parsingTime = LocalTime.parse("03:28");
        System.out.println(parsingTime);

        LocalTime usingOf = LocalTime.of(3, 20);
        System.out.println(usingOf);

        LocalTime fastForward = LocalTime.parse("03:28").plus(5, ChronoUnit.HOURS);
        System.out.println(fastForward);

        int whichHour = LocalTime.parse("03:28").getHour();
        System.out.println(whichHour);

        boolean comparingTime = LocalTime.parse("03:20").isBefore(LocalTime.parse("02:38"));
        System.out.println(comparingTime);

        LocalTime maximumTime = LocalTime.MAX;
        System.out.println(maximumTime);
    }
}
