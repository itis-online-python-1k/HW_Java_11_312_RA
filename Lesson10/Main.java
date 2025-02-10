import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void execute(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Marsel");
        items.add("Maxim");
        items.set(0, "Vlad");
        items.add(0, "Ilshat");

        System.out.println(items);

        Deque<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        ((List<Integer>) numbers).set(0, 4);
        numbers.addFirst(3);

        System.out.println(numbers.peekFirst());

        System.out.println(numbers);
    }
}
