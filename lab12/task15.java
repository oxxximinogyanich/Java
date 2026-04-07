// task15.java
import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char symbol = scanner.nextLine().charAt(0);

        System.out.println(text.endsWith(String.valueOf(symbol)));
    }
}