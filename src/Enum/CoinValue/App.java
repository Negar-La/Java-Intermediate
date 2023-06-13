package Enum.CoinValue;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal inputBigDecimal = new BigDecimal("0");
        boolean hasError = false;
        System.out.println("How much money do you have?");
        do{
            try{
                double input = Double.parseDouble(sc.nextLine());
                 inputBigDecimal = new BigDecimal(input);
                hasError = false;
            } catch(NumberFormatException e){
                System.out.println("Invalid input, please try again");
                hasError = true;
            }

        } while(hasError);

        int quarterResult = calculateChange(Coin.QUARTER, inputBigDecimal);
        System.out.println("Your money is equal to " + quarterResult + " quarters");

        int dimeResult = calculateChange(Coin.DIME, inputBigDecimal);
        System.out.println("Your money is equal to " + dimeResult + " dimes");

        int nickelResult = calculateChange(Coin.NICKEL, inputBigDecimal);
        System.out.println("Your money is equal to " + nickelResult + " nickels");

        int pennyResult = calculateChange(Coin.PENNY, inputBigDecimal);
        System.out.println("Your money is equal to " + pennyResult + " pennies");
    }

    public static int calculateChange(Coin c, BigDecimal amount){
        switch (c){
            case QUARTER:
                return amount.divide(new BigDecimal("0.25")).intValue();
            case DIME:
                return amount.divide(new BigDecimal("0.10")).intValue();
            case NICKEL:
                return amount.divide(new BigDecimal("0.05")).intValue();
            case PENNY:
                return amount.divide(new BigDecimal("0.01")).intValue();
            default:
                throw new UnsupportedOperationException();
        }
    }




}
