import java.util.*;

public class Task19 {
    public static void main(String[] args) {
        List<List<Integer>> nested = List.of(
            List.of(1,2),
            List.of(3,4)
        );

        nested.stream()
            .flatMap(List::stream)
            .forEach(System.out::println);
    }
}