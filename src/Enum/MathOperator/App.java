package Enum.MathOperator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter operand 1:");
        boolean hasErrors = false;
        int operand1 = 0;
        int operand2 = 0;

        do {
            try {
                operand1 = Integer.parseInt(sc.nextLine());
                hasErrors = false;
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
                hasErrors = true;
            }
        } while(hasErrors);

        System.out.println("Please enter operand 2:");
        do {
            try {
                 operand2 = Integer.parseInt(sc.nextLine());
                hasErrors = false;
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
                hasErrors = true;
            }
        } while(hasErrors);

        System.out.println("RESULTS:");
        int resultPlus = calculate(MathOperators.PLUS, operand1, operand2);
        System.out.println(operand1 + " + " + operand2 + " = " + resultPlus);

        int resultMinus = calculate(MathOperators.MINUS, operand1, operand2);
        System.out.println(operand1 + " - " + operand2 + " = " + resultMinus);

        int resultMultiply = calculate(MathOperators.MULTIPLY, operand1, operand2);
        System.out.println(operand1 + " * " + operand2 + " = " + resultMultiply);

        int resultDivide = calculate(MathOperators.DIVIDE, operand1, operand2);
        System.out.println(operand1 + " / " + operand2 + " = " + resultDivide);
    }


    public static int calculate(MathOperators operator, int operand1, int operand2) {
        switch(operator) {
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException();
        }
    }


}
