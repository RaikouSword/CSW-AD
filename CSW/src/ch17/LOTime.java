import java.time.LocalDateTime;
import java.time.Month;

public class LOTime {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2018, Month.MARCH, 18, 8, 38));
        System.out.println(LocalDateTime.parse("2018-01-28T06:24"));
        LocalDateTime addHours = LocalDateTime.now().plusHours(3);
        System.out.println(addHours);
        LocalDateTime subHours = LocalDateTime.now().minusHours(3);
        System.out.println(subHours);
        System.out.println(LocalDateTime.now().getMonth());
    }
}
