
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        String input = scanner.nextLine();
        int days = Integer.valueOf(input);
        int seconds = days * 86400;
        System.out.println(seconds);

    }
}
