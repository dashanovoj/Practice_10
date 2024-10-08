import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MergeAndSortStudents {
    public static class Student {
        private String firstName;
        private String lastName;
        private String speciality;
        private int course;
        private String group;
        private double GPA;

        public Student(String firstName, String lastName, String speciality, int course, String group, double GPA) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.speciality = speciality;
            this.course = course;
            this.group = group;
            this.GPA = GPA;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSpeciality() {
            return speciality;
        }

        public int getCourse() {
            return course;
        }

        public String getGroup() {
            return group;
        }

        public double getGPA() {
            return GPA;
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

    public static class SortingStudents {
        private List<Student> students;

        public SortingStudents() {
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void sortStudentsByGPA() {
            students.sort(new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return Double.compare(s2.getGPA(), s1.getGPA());
                }
            });
        }

        public void sortStudentsByCourse() {
            students.sort(new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return Integer.compare(s1.getCourse(), s2.getCourse());
                }
            });
        }

        public void printStudents() {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students in list 1:");
        int numStudents1 = sc.nextInt();
        List<Student> students1 = new ArrayList<>(numStudents1);
        for (int i = 0; i < numStudents1; i++) {
            System.out.println("Enter student's first name:");
            String firstName = sc.next();
            System.out.println("Enter student's last name:");
            String lastName = sc.next();
            System.out.println("Enter student's speciality:");
            String speciality = sc.next();
            System.out.println("Enter student's course:");
            int course = sc.nextInt();
            System.out.println("Enter student's group:");
            String group = sc.next();
            System.out.println("Enter student's GPA:");
            double GPA = sc.nextDouble();
            Student student = new Student(firstName, lastName, speciality, course, group, GPA);
            students1.add(student);
        }

        System.out.println("Enter the number of students in list 2:");
        int numStudents2 = sc.nextInt();
        List<Student> students2 = new ArrayList<>(numStudents2);
        for (int i = 0; i < numStudents2; i++) {
            System.out.println("Enter student's first name:");
            String firstName = sc.next();
            System.out.println("Enter student's last name:");
            String lastName = sc.next();
            System.out.println("Enter student's speciality:");
            String speciality = sc.next();
            System.out.println("Enter student's course:");
            int course = sc.nextInt();
            System.out.println("Enter student's group:");
            String group = sc.next();
            System.out.println("Enter student's GPA:");
            double GPA = sc.nextDouble();
            Student student = new Student(firstName, lastName, speciality, course, group, GPA);
            students2.add(student);
        }

        SortingStudents sorter = new SortingStudents();
        for (Student student : students1) {
            sorter.addStudent(student);
        }
        for (Student student : students2) {
            sorter.addStudent(student);
        }

        System.out.println("The merged list of students sorted by GPA:");
        sorter.sortStudentsByGPA();
        sorter.printStudents();

        System.out.println("The merged list of students sorted by course:");
        sorter.sortStudentsByCourse();
        sorter.printStudents();
    }
}
