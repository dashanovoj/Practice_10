import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static class SortingStudentsByGPA {
        private ArrayList<Task1.Student> iDNumber; // массив объектов Student

        // Конструктор
        public SortingStudentsByGPA() {
            iDNumber = new ArrayList<>();
        }

        // 1) Метод для заполнения массива setArray()
        public void setArray(List<Task1.Student> students) {
            for (Task1.Student student : students) {
                iDNumber.add(student);
            }
        }

        /* 2) Метод для сортировки по среднему баллу студентов quicksort(),
        реализующий интерфейс Comparator, который сортирует студентов с их
        итоговым баллом в порядке убывания. */
        public void quicksort() {
            iDNumber.sort(new Comparator<Task1.Student>() {
                @Override
                public int compare(Task1.Student s1, Task1.Student s2) {
                    return Double.compare(s2.getGPA(), s1.getGPA());
                }
            });
        }

        // 3) Метод для вывода массива студентов outArray()
        public void outArray() {
            for (Task1.Student student : iDNumber) {
                System.out.println(student);
            }
        }

        // 4) Метод для сортировки списка студентов по другому полю (курс)
        public void sortByCourse() {
            iDNumber.sort(new Comparator<Task1.Student>() {
                @Override
                public int compare(Task1.Student s1, Task1.Student s2) {
                    return Integer.compare(s1.getCourse(), s2.getCourse());
                }
            });
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of students: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<Task1.Student> students = new ArrayList<>(number); // создаём список студентов
        // Для элемента списка вводим с клавиатуры данные студента
        for (int i = 0; i < number; i++) {
            System.out.println("Enter student's first name: ");
            String firstName = sc.next();
            System.out.println("Enter student's last name: ");
            String lastName = sc.next();
            System.out.println("Enter student's speciality: ");
            String speciality = sc.next();
            System.out.println("Enter student's course: ");
            int course = sc.nextInt();
            System.out.println("Enter student's group: ");
            String group = sc.next();
            System.out.println("Enter student's GPA: ");
            Double GPA = sc.nextDouble();
            // Для элемента списка создаем экземпляр класса Student
            Task1.Student s = new Task1.Student(firstName, lastName, speciality, course, group, GPA);
            students.add(s); // добавляем элемент в список
        }

        // Создаём экземпляр класса для работы со списком студентов
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        // Передаём массив
        sorter.setArray(students);

        // Сортируем его по среднему баллу
        sorter.quicksort();

        // Выводим отсортированный массив
        System.out.println("The list of students sorted by GPA:");
        sorter.outArray();

        // Сортируем массив по курсу
        sorter.sortByCourse();

        // Выводим отсортированный массив
        System.out.println("The list of students sorted by course:");
        sorter.outArray();

    }
}
