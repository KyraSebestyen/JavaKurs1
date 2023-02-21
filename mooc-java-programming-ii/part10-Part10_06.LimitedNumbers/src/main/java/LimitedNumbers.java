
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> positiveNumbers = new ArrayList<>();

        while(true) {
            int input = Integer.parseInt(scanner.nextLine());
            if(input < 0) {
                break;
            }
            positiveNumbers.add(input);
        }

        positiveNumbers.stream()
                .filter(number -> number >= 1 && number <= 5)
                .forEach(System.out::println);

    }
}
