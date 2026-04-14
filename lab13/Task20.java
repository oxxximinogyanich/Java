import java.util.*;

class Order20 {
    int price;

    Order20(int price) {
        this.price = price;
    }
}

public class Task20 {
    public static void main(String[] args) {
        List<Order20> orders = List.of(
            new Order20(500),
            new Order20(1500),
            new Order20(2000)
        );

        orders.stream()
            .filter(o -> o.price > 1000)
            .sorted(Comparator.comparing(o -> o.price))
            .forEach(o -> System.out.println(o.price));
    }
}