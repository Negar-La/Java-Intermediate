package Enum.MathOperator;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter operand 1:");
        boolean hasErrors = false;
        BigDecimal operand1 = new BigDecimal("0");  //use String constructor "0"
        BigDecimal operand2 = new BigDecimal("0");  //use String constructor "0"

        do {
            try {
                operand1 = new BigDecimal(sc.nextLine());
                hasErrors = false;
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
                hasErrors = true;
            }
        } while(hasErrors);

        System.out.println("Please enter operand 2:");
        do {
            try {
                 operand2 = new BigDecimal(sc.nextLine());
                hasErrors = false;
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
                hasErrors = true;
            }
        } while(hasErrors);

        System.out.println("RESULTS:");
        BigDecimal resultPlus = calculate(MathOperators.PLUS, operand1, operand2);
        System.out.println(operand1 + " + " + operand2 + " = " + resultPlus);

        BigDecimal resultMinus = calculate(MathOperators.MINUS, operand1, operand2);
        System.out.println(operand1 + " - " + operand2 + " = " + resultMinus);

        BigDecimal resultMultiply = calculate(MathOperators.MULTIPLY, operand1, operand2);
        System.out.println(operand1 + " * " + operand2 + " = " + resultMultiply);

        BigDecimal resultDivide = calculate(MathOperators.DIVIDE, operand1, operand2);
        System.out.println(operand1 + " / " + operand2 + " = " + resultDivide);
    }


    public static BigDecimal calculate(MathOperators operator, BigDecimal operand1, BigDecimal operand2) {
        switch(operator) {   //switch on the value of the operator that is passed in
            case PLUS:
                return operand1.add(operand2);
            case MINUS:
                return operand1.subtract(operand2);
            case MULTIPLY:
                return operand1.multiply(operand2);
            case DIVIDE:
                return operand1.divide(operand2, 2, RoundingMode.HALF_UP);
            default:
                throw new UnsupportedOperationException("Unknown math operator");
        }
    }


}
