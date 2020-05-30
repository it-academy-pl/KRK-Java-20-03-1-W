package pl.itacademy.immutable;

import java.util.Objects;

public class Student /*extends Person*/ {

    private String course;

    public Student(String firstName, String lastName, Address address, String course) {
        //super(firstName, lastName, address);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                "} " + super.toString();
    }
}
