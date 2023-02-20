
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

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

        double average = numbers.stream().mapToInt(number -> number).average().getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}
