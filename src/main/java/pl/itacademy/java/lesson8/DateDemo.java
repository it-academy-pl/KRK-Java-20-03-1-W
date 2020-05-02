package pl.itacademy.java.lesson8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        System.out.println("BEFORE Java 8");
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        date.setTime(158841);
        System.out.println(date);

        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        System.out.println(time.format(date));

        String timeText = "13:21:01";
        Date parsedText = time.parse(timeText);
        System.out.println(parsedText);


        Date now = new Date();
        System.out.println(now);

        Calendar c = Calendar.getInstance();
        c.setTime(now);
        c.add(Calendar.HOUR, 5);
        now = c.getTime();
        System.out.println(now);

        System.out.println("Java 8 and after");
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.plusDays(7));

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        System.out.println(currentTime.plusMinutes(20));

        LocalDate parsedDate = LocalDate.parse("2020-12-31");
        System.out.println(parsedDate);

        LocalDateTime nowAndToday = LocalDateTime.now();
        System.out.println(nowAndToday);

        nowAndToday = nowAndToday.plusDays(7);
        System.out.println(nowAndToday);
    }
}
