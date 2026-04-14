import java.util.*;

class Student13 {
    String name;
    int age;

    Student13(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task13 {
    public static void main(String[] args) {
        List<Student13> list = List.of(
            new Student13("Ali", 20),
            new Student13("Dana", 18),
            new Student13("Ivan", 22)
        );

        list.stream()
            .sorted(Comparator.comparing(s -> s.age))
            .forEach(s -> System.out.println(s.name + " " + s.age));
    }
}