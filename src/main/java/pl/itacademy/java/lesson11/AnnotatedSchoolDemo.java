package pl.itacademy.java.lesson11;

public class AnnotatedSchoolDemo {
    public static void main(String[] args) {
        School school = new School();
        Class<? extends School> aClass = school.getClass();

        if (aClass.isAnnotationPresent(Lesson.class)) {
            Lesson lesson = aClass.getAnnotation(Lesson.class);
            System.out.println(lesson.date());
            System.out.println(lesson.time());
        }

        if (aClass.isAnnotationPresent(Schedule.class)) {
            Schedule schedule = aClass.getAnnotation(Schedule.class);
            for (Lesson lesson : schedule.value()) {
                System.out.println(lesson.date() + " " + lesson.time());
            }
        }
    }
}
