import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите что-нибудь:");
        sc.nextLine();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("Экран очищен");
    }
}