import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "Stream", "API");

        words.stream()
            .sorted((a, b) -> a.length() - b.length())
            .forEach(System.out::println);
    }
}