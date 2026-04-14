import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "lambda", "api");

        words.stream()
            .filter(s -> s.length() > 5)
            .forEach(System.out::println);
    }
}