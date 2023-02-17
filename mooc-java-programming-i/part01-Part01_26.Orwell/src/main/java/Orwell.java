
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        String input = scan.nextLine();
        int number = Integer.valueOf(input);

        if(number == 1984){
            System.out.println("Orwell");
        }
    }
}
