import java.time.*;

public class Main {

    public static void main(String[] args) {

        LocalDateTime birthday = LocalDateTime.of(2008, 8, 22, 12, 0, 0);
        ZoneId us = ZoneId.of("America/New_York");
        ZonedDateTime birthdayZoned = ZonedDateTime.of(birthday, us);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime birthdayParis = birthdayZoned.withZoneSameInstant(london);
        System.out.println(birthdayZoned);
        System.out.println(birthdayParis);




    }


}
