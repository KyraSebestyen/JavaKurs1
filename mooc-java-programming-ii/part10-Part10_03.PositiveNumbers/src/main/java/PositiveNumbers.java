
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int i = -10; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);
        System.out.println(positive(numbers));

    }

    public static List<Integer> positive(List<Integer> numbers) {
        return  numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
    }

}
