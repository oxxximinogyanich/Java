// Task15.java
import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        Random random = new Random();
        int num;

        do {
            num = random.nextInt(10);
            System.out.println(num);
        } while (num != 0);
    }
}