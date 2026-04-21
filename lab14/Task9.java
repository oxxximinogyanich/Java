// Task9.java
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N:");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Сумма: " + sum);
    }
}