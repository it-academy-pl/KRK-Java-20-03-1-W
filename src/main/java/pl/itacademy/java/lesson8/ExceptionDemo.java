package pl.itacademy.java.lesson8;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

public class ExceptionDemo {
    public static void main(String[] args) {
//        Object o = null;
//        o.toString();
//        int a = 10/0;
//        System.out.println(a);

//        FileReader reader = new FileReader("C:/temp/test.txt");

        Object a = new Object();
        if (a == null) {
            throw new NullPointerException("Stupid example here :)");
        } else {
            System.out.println(a.toString());
        }

        try {
            riskyMethod();
            System.out.println("Try section has been proceed without any exceptions!");
        } catch (SQLException e) {
            System.out.println("SQLException happens!");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException happens!");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException happens!");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally section. It always been executed!");
        }

        System.out.println("We still survive :)");

        //throw new IOException("Cant read file from disk");

    }

    private static void riskyMethod() throws SQLException, IOException {
        int random = ThreadLocalRandom.current().nextInt(100);
        if (random > 50) {
            throw new SQLException("Method execution fail! Random number is more than 50!");
        }
        if (random > 30) {
            throw new ArithmeticException("Random number is more than 30!");
        }
        if (random > 20) {
            throw new IOException("Random number is more than 20!");
        }
        if (random > 10) {
            throw new RuntimeException("Random number is more than 10!");
        }
    }
}
