import java.util.function.BinaryOperator;

public class Task1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(5, 3));
    }
}