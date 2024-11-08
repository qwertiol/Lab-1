public class Student {

    private String name; // Имя
    private String group; // Группа
    private int year; // Курс
    private int[] grades; // Оценки

    // Конструктор класса со всеми аргументами
    public Student(String name, String group, int year, int[] grades) {
        this.name = name;
        this.group = group;
        this.year = year;
        this.grades = grades.clone();
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getYear() {
        return year;
    }

    public int[] getGrades() {
        return grades.clone();
    }

    // Метод, возвращающий среднюю оценку
    public double getAverageGrade() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum/grades.length;
    }

    public void promote() {
        year++;
    }

    // Метод вывода всей информации о студенте в консоль (не используется)
    public void displayInfo() {
        System.out.print("Имя: " + name + ", Группа: " + group + ", Курс: " + year + ", Оценки: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }

}