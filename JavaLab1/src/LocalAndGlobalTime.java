import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

public class LocalAndGlobalTime {
    public static void main(String[] args){


        System.out.println("Czas Lokalny: " + LocalDateTime.now());

        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));

        System.out.println("Czas Globalny: " + LocalDateTime.now());



    }

}
