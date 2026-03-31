import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b (степень): ");
        double b = sc.nextDouble();

        double result = Math.pow(a, b);

        System.out.println("Результат: " + result);
    }
}