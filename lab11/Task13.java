import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1: sin 2: cos 3: tan");
        int choice = sc.nextInt();

        System.out.print("Введите число: ");
        double a = sc.nextDouble();

        switch (choice) {
            case 1: System.out.println(Math.sin(a)); break;
            case 2: System.out.println(Math.cos(a)); break;
            case 3: System.out.println(Math.tan(a)); break;
            default: System.out.println("Ошибка");
        }
    }
}