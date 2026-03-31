import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите число: ");
            double a = sc.nextDouble();
            System.out.println("Вы ввели: " + a);
        } catch (Exception e) {
            System.out.println("Ошибка ввода!");
        }
    }
}