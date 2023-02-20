
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(Integer.parseInt(input));
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();

        if (command.equals("n")) {
            double averageOfNegative = numbers.stream()
                    .mapToInt(number -> number)
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + averageOfNegative);
        } else {
            double averageOfPositive = numbers.stream()
                    .mapToInt(number -> number)
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + averageOfPositive);
        }

    }
}
