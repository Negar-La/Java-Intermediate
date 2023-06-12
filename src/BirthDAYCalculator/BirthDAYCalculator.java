package BirthDAYCalculator;

import java.io.FilterOutputStream;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthDAYCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Magical BirthDAY Calculator!");
//Tell them the day of the week their birthday falls on.
        System.out.println("What's your birthday (mm/dd/yyyy)?");
        String birthdayString = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate origBirthday = LocalDate.parse(birthdayString, formatter);

        DayOfWeek dayOfWeek = origBirthday.getDayOfWeek();
        //System.out.println(dayOfWeek);
        System.out.println("\nThat means you were born on a "+ dayOfWeek + "!\n");


//Then tell them the day of the week it falls on this year!
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();  //current year = 2023
        //System.out.println(currentYear);

        int dayOfMonth = origBirthday.getDayOfMonth();  //13
        //System.out.println(dayOfMonth);

        int monthValue = origBirthday.getMonthValue();     //12
        //System.out.println(monthValue);

        String newDateAsString = currentYear + "-"+ monthValue+ "-" + dayOfMonth;
        System.out.println(newDateAsString);
        LocalDate thisBirthday = LocalDate.parse(newDateAsString, formatter);  //2023-12-13
        //System.out.println(newDate);
/*
        DayOfWeek dayOnThisYear = thisBirthday.getDayOfWeek();

        System.out.println("This year it falls on a "+ dayOnThisYear+ "...\n");

//Next, tell them what day it is today & the number of days until their next birthday...
        long days = ChronoUnit.DAYS.between(today, thisBirthday);


        System.out.println("And since today is " + today+ ", there's " + days + " days until the next one!\n");

//And how many years old they will be!
        Period age = origBirthday.until(thisBirthday);
        int years = age.getYears();

        System.out.println("Bet yer excited to be turning " + years + "!");

 */
    }
}
