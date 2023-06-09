package JavaDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaDateTime {
    public static void main(String[] args) {
        //a new LocalDate object containing today's date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        //__________________________________

        // object containing the date represented by a well-formed ISO-8601 string = YYYY-MM-DD
        ld = LocalDate.parse("1985-12-13");
        System.out.println(ld);         //1985-12-13
        String ldFormatted = ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(ldFormatted);    //Friday, December 13, 1985

        //minusDays__________________________________

        ld = LocalDate.now();
        LocalDate ld2 = ld.minusDays(2);  //calculate date 2 days ago.
        String x = ld2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(x);

        String x2 = ld2.format(DateTimeFormatter.ofPattern("MM+++dd+++yyyy"));
        System.out.println(x2);

        //Period  until__________________________________

        LocalDate ld3 = LocalDate.now();
        System.out.println(ld3);
        Period diff = ld3.until(ld2);
        System.out.println(diff);   //P-2D  -2 days
        System.out.println(diff.getDays());     //-2

        //plusMonths  until__________________________________

        LocalDate ld4 = LocalDate.now();
        LocalDate ld5 = ld4.plusMonths(11);
        Period diff2 = ld4.until(ld5);
        System.out.println(diff2);   // P11M  +11 months
        System.out.println(diff2.getMonths());      // 11
        System.out.println(ld5.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        //DateTimeFormatter.ofPattern__________________________________

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        ld = LocalDate.parse("02/27/2010", formatter);    //2010-02-27     still ISO format
        System.out.println(ld); //the format has not been changed yet! we need to use .format method
        String formatted = ld.format(DateTimeFormatter.ofPattern("MM=dd/==yyyy"));
        System.out.println(formatted);

        //toString   parse__________________________________

        //to convert LocatDate object to String format so that you can store it in some place
        String isoDate = ld.toString();
        System.out.println(isoDate);

        //convert String to LocalDate again:
        ld = LocalDate.parse(isoDate);
        System.out.println(ld);

        //ofLocalizedDate__________________________________

         ld4 = LocalDate.now();
        formatted = ld4.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String formatted2 = ld4.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(formatted);      //Sunday, June 11, 2023  =Full localized format
        System.out.println(formatted2);     // 6/11/23

        //LocalDateTime__________________________________

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);        //2023-06-12T13:16:35.788893300
        formatted = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
        System.out.println(formatted);      //2023-06-12 01:23:33

        //legacyDate  GregorianCalendar ____________________________
        Date legacyDate = new Date();
        System.out.println(legacyDate);     //Sun Jun 11 21:36:34 EDT 2023

        GregorianCalendar legacyCalender = new GregorianCalendar(); // instantiate a Gregorian calendar object for now
        System.out.println(legacyCalender);  // a list of different properties

        ZonedDateTime zdt2 = legacyCalender.toZonedDateTime();
        LocalDate y = zdt2.toLocalDate();
        System.out.println(y);

        // ZonedDateTime____________________________
        ZonedDateTime zdt = ZonedDateTime.ofInstant(legacyDate.toInstant(), ZoneId.systemDefault());

        System.out.println(zdt);

        ld = zdt.toLocalDate();
        System.out.println(ld);
        //____________________________


    }
}
