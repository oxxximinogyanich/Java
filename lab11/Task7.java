import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Умножение: " + (a * b));

        if (b != 0)
            System.out.println("Деление: " + (a / b));
        else
            System.out.println("Ошибка деления");
    }
}