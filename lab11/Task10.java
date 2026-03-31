import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            double res = a + b;
            String record = a + " + " + b + " = " + res;

            history.add(record);
        }

        System.out.println("История:");
        for (String s : history) {
            System.out.println(s);
        }
    }
}