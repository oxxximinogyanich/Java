// Task16.java
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.println("Введите число (0 для выхода):");
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Сумма: " + sum);
    }
}