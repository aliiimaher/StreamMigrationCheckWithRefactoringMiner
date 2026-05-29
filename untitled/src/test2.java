import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.forEach(number -> System.out.println(number));
    }
}
