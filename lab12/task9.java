// task9.java
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String[] parts = text.split(delimiter);

        for (String part : parts) {
            System.out.println(part);
        }
    }
}