package JavaDateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class JavaDateTime {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now(); //a new LocalDate object containing today's date
        System.out.println(ld);
        //__________________________________

        ld = LocalDate.parse("2020-02-02"); // object containing the date represented by a well-formed ISO-8601 string
        System.out.println(ld);
        //__________________________________

        ld = LocalDate.now();
        LocalDate ld2 = ld.minusDays(22);  //calculate date 2 days ago.
        System.out.println(ld2);
        //__________________________________

        LocalDate ld3 = LocalDate.now();
        System.out.println(ld3);
        Period diff = ld3.until(ld2); //P-2D
        System.out.println(diff);
        //__________________________________

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        ld = LocalDate.parse("02/07/2010", formatter);
        String formatted = ld.format(formatter);
        System.out.println(formatted);
        //__________________________________

        LocalDate ld4 = LocalDate.now();
        formatted = ld4.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)); //Tuesday, May 30, 2023
        System.out.println(formatted);
        //____________________________
        Date legacyDate = new Date();
        System.out.println(legacyDate);

        ZonedDateTime zdt = ZonedDateTime.ofInstant(
                legacyDate.toInstant(), ZoneId.systemDefault());

        System.out.println(zdt);

        ld = zdt.toLocalDate();
        System.out.println(ld);
        //____________________________


    }
}
