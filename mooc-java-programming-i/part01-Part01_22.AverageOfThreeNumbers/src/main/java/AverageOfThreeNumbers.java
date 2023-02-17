
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        String input = scanner.nextLine();
        int number1 = Integer.valueOf(input);

        System.out.println("Give the second number:");
        input = scanner.nextLine();
        int number2 = Integer.valueOf(input);

        System.out.println("Give the third number:");
        input = scanner.nextLine();
        int number3 = Integer.valueOf(input);

        double average = (1.0 * number1 + number2 + number3) / 3;

        System.out.println("The average is " + average);

    }
}
