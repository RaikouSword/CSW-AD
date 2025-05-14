package csu2;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedQ {

    public static void main(String[] args) {

        ZoneId id = ZoneId.of("UTC");
        System.out.println(id);

        Set<String> allIds = ZoneId.getAvailableZoneIds();
        System.out.println(allIds);

        ZonedDateTime specificZone = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("UTC"));
        System.out.println(specificZone);

        LocalDateTime ltd = LocalDateTime.of(2018, Month.MARCH, 18, 8, 28);
        ZoneOffset os = ZoneOffset.of("+04:00");

        OffsetDateTime osByFour = OffsetDateTime.of(ltd, os);
        System.out.println(osByFour);
    }
}
