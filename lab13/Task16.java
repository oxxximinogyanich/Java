import java.util.*;
import java.util.stream.*;

class Student16 {
    String name;
    int age;

    Student16(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task16 {
    public static void main(String[] args) {
        List<Student16> list = List.of(
            new Student16("Ali", 20),
            new Student16("Dana", 20),
            new Student16("Ivan", 21)
        );

        Map<Integer, List<Student16>> grouped =
            list.stream()
                .collect(Collectors.groupingBy(s -> s.age));

        System.out.println(grouped);
    }
}