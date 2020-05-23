package pl.itacademy.java.lesson11;

import java.math.BigDecimal;

public class UtilClass {

    //Please, use more proper version of the method with BigDecimals
    @Deprecated(since = "from 23rd of May", forRemoval = true)
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(BigDecimal a, BigDecimal b) {
        return a.add(b).doubleValue();
    }


}
