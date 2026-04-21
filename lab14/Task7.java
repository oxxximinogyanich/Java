// Task7.java
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Введите первое число:");
            int a = scanner.nextInt();
            System.out.println("Введите второе число:");
            int b = scanner.nextInt();
            System.out.println("Сумма: " + (a + b));
            scanner.nextLine();
            System.out.println("Продолжить? (yes/no):");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Программа завершена.");
    }
}