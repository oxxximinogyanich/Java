import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,3,9,2);

        int max = list.stream()
            .max(Integer::compare)
            .orElse(0);

        System.out.println(max);
    }
}