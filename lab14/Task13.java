// Task13.java
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int original = scanner.nextInt();
        int number = original;
        int reversed = 0;

        do {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        } while (number > 0);

        if (original == reversed) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}