import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    public static class Student {
        // Поля данных класса Student
        String firstName;
        String lastName;
        String speciality;
        Integer course;
        String group;
        Double GPA;

        // Конструктор
        public Student(String firstName, String lastName, String speciality, Integer course, String group, Double GPA) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.speciality = speciality;
            this.course = course;
            this.group = group;
            this.GPA = GPA;
        }

        // Getter'ы и Setter'ы
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSpeciality() {
            return speciality;
        }

        public void setSpeciality(String speciality) {
            this.speciality = speciality;
        }

        public Integer getCourse() {
            return course;
        }

        public void setCourse(Integer course) {
            this.course = course;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public Double getGPA() {
            return GPA;
        }

        public void setGPA(Double GPA) {
            this.GPA = GPA;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", speciality='" + speciality + '\'' +
                    ", course=" + course +
                    ", group='" + group + '\'' +
                    ", GPA=" + GPA +
                    '}';
        }
    }
}