// Task18.java
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int min = Integer.MAX_VALUE;

        do {
            System.out.println("Введите число (0 для выхода):");
            num = scanner.nextInt();
            if (num != 0 && num < min) {
                min = num;
            }
        } while (num != 0);

        if (min == Integer.MAX_VALUE) {
            System.out.println("Нет введённых чисел");
        } else {
            System.out.println("Минимальное: " + min);
        }
    }
}