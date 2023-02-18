
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int positiveSum = 0;

        while(true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                positiveCount++;
                positiveSum += number;
            }
        }

        if (positiveCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * positiveSum / positiveCount);
        }

    }
}
