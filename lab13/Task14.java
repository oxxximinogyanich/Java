import java.util.*;

class Student14 {
    String name;
    int age;
    double grade;

    Student14(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class Task14 {
    public static void main(String[] args) {
        List<Student14> students = List.of(
            new Student14("Ali", 20, 85),
            new Student14("Dana", 22, 75),
            new Student14("Ivan", 21, 90)
        );

        students.stream()
            .filter(s -> s.grade > 80)
            .sorted(Comparator.comparing(s -> s.name))
            .forEach(s -> System.out.println(s.name));
    }
}