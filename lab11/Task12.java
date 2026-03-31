import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Число: ");
        double a = sc.nextDouble();

        System.out.print("Процент: ");
        double b = sc.nextDouble();

        double result = (a * b) / 100;

        System.out.println("Результат: " + result);
    }
}