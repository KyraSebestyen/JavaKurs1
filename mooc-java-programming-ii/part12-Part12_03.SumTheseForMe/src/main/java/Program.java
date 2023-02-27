
import java.util.stream.IntStream;

public class Program {

    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        return IntStream.range(0, array.length)
                .filter(index -> index >= fromWhere && index < toWhere)
                .map(index -> array[index])
                .filter(number -> number >= smallest && number <= largest)
                .sum();
    }

}
