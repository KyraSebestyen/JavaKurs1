
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        String input = scan.nextLine();
        int number1 = Integer.valueOf(input);

        System.out.println("Give the second number:");
        input = scan.nextLine();
        int number2 = Integer.valueOf(input);

        if(number1 == number2){
            System.out.println("The numbers are equal!");
        } else if(number1 > number2){
            System.out.println("Greater number is: " + number1);
        } else {
            System.out.println("Greater number is: " + number2);
        }

    }
}
