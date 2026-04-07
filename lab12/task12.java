// task12.java
import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        String longest = "";

        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }

        System.out.println(longest);
    }
}