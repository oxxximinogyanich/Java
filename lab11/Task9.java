import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1:+ 2:- 3:* 4:/");
        int choice = sc.nextInt();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        switch (choice) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4:
                if (b != 0) System.out.println(a / b);
                else System.out.println("Ошибка");
                break;
            default:
                System.out.println("Неверно");
        }
    }
}