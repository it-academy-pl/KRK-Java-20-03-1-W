package pl.itacademy.java.lesson8;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

public class MulticatchExample {
    public static void main(String[] args) {
        try {
            System.out.println(riskyMethod());
        } catch (SQLException | IOException | ArithmeticException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }

    }

    public static int riskyMethod() throws SQLException, IOException {
        int random = ThreadLocalRandom.current().nextInt(100);
        if (random > 80) {
            throw new SQLException("Number is more than 80!");
        }
        if (random > 50) {
            throw new IOException("Number is more than 50!");
        }
        if (random > 30) {
            throw new ArithmeticException("Number is more than 30!");
        }
        return random;
    }
}
