package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalClass {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("42.35");
        System.out.println(a);

        BigDecimal b = a.setScale(1, RoundingMode.HALF_UP);
        System.out.println(b);

        BigDecimal c = a.setScale(1, RoundingMode.HALF_DOWN);
        System.out.println(c);

        BigDecimal op1 = new BigDecimal("10");
        BigDecimal op2 = new BigDecimal("6");
        BigDecimal d = op1.divide(op2, 2, RoundingMode.HALF_UP); //1.67
        System.out.println(d);
        BigDecimal e = op1.divide(op2, RoundingMode.HALF_UP);  //2
        System.out.println(e);

    }
}
