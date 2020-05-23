package pl.itacademy.java.lesson11;

import java.lang.annotation.*;

@Repeatable(Schedule.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Lesson {
    String date();

    String time() default "12:00";
}
