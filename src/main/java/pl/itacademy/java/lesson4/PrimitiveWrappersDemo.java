package pl.itacademy.java.lesson4;

public class PrimitiveWrappersDemo {
    public static void main(String[] args) {
        int a = 5;
        Integer aa = 5;
        Double bb = 5.0;
        double bbb = bb;
        bbb = bb + aa;

        Boolean trueValue = true;
        Boolean falseValue = false;

        String abcd = "text" + "java";

        String numberValue = "10";
        int number = Integer.valueOf(numberValue);
        number = Integer.parseInt(numberValue);

        Integer intNumber = 10;
        int anotherIntNumber = 10;

        Boolean aTrueValue = Boolean.TRUE;
        Boolean aFalseValue = Boolean.FALSE;

        Integer maxValue = Integer.MAX_VALUE;
    }
}
