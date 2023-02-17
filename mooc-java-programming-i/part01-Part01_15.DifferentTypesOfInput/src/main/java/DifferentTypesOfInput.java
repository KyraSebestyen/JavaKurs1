
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string = scan.nextLine();
        System.out.println("Give an integer:");
        String input = scan.nextLine();
        int integer = Integer.valueOf(input);
        System.out.println("Give a double:");
        input = scan.nextLine();
        double doubleNumber = Double.valueOf(input);
        System.out.println("Give a boolean:");
        input = scan.nextLine();
        boolean booleanInput = Boolean.valueOf(input);

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + doubleNumber);
        System.out.println("You gave the boolean " + booleanInput);

    }
}
