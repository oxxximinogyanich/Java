// Task17.java
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.println("Введите пароль (минимум 6 символов):");
            password = scanner.nextLine();
        } while (password.length() < 6);

        System.out.println("Пароль принят");
    }
}