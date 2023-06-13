package Enum.UntilFriday;

import java.util.Scanner;



public class EnumFriday {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a day");
        String input = sc.nextLine();

        DaysOfWeek day = DaysOfWeek.valueOf(input.toUpperCase());
        int x = calculateRemainingDay(day);

        System.out.println("there are " + x + " days until Friday!!!");
    }

    public static int calculateRemainingDay(DaysOfWeek d){
        switch (d){
            case MONDAY:
                return 4;
            case TUESDAY:
                return 3;
            case WEDNESDAY:
                return 2;
            case THURSDAY:
                return 1;
            case FRIDAY:
                return 0;
            case SATURDAY:
                return 6;
            case SUNDAY:
                return 5;
            default:
                throw new UnsupportedOperationException();
        }
    }



}
