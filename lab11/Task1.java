import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.print("Операция (+ - * /): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Результат: " + (a + b)); break;
            case '-': System.out.println("Результат: " + (a - b)); break;
            case '*': System.out.println("Результат: " + (a * b)); break;
            case '/':
                if (b != 0) System.out.println("Результат: " + (a / b));
                else System.out.println("Деление на 0!");
                break;
            default: System.out.println("Ошибка");
        }
    }
}