import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(); // Коллекция объектов класса Student

        students.add(new Student("Ваня", "Б24-106", 1, new int[]{3, 3, 2}));
        students.add(new Student("Маша", "С24-102", 1, new int[]{5, 4, 5}));
        students.add(new Student("Кирилл", "Б24-504", 1, new int[]{5, 5, 5}));

        printStudents(students, 1);

        System.out.println("---"); // дивайдер

        promoteStudents(students);

        printStudents(students, 2);
    }

    // Метод для перевода студентов на следующий курс и удаления стундентов с низким средним баллом
    public static void promoteStudents(List<Student> students) {
        List<Student> studentsToRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.getAverageGrade() < 3) {
                studentsToRemove.add(student);
            } else {
                student.promote();
            }
        }
        students.removeAll(studentsToRemove);
    }

    // Метод для вывода имен студентов заданного курса
    public static void printStudents(List<Student> students, int year) {
        for (Student student : students) {
            if (student.getYear() == year) {
                System.out.println(student.getName());
            }
        }
    }
}