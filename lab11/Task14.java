import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите a b c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double result = a + b * c;

        System.out.println("Результат (a + b * c): " + result);
    }
}