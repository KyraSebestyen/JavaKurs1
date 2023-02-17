
import java.util.Scanner;

public class SumOfThreeNumbers {

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

        System.out.println("The sum of the numbers is " + (number1 + number2 + number3));

    }
}
