package pl.itacademy.java.lesson8;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

public class TryWithoutCatchDemo {
    public static void main(String[] args) throws IOException, SQLException {
        try {
            System.out.println(riskyMethod());
        } finally {
            System.out.println("Finally section. Always been executed!");
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
