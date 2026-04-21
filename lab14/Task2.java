// Task2.java
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Введите положительное число:");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Вы ввели: " + number);
    }
}