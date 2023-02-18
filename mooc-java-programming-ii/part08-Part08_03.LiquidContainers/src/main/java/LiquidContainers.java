
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] commandAndAmount = input.split(" ");
            String command = commandAndAmount[0];
            int amount = Integer.parseInt(commandAndAmount[1]);

            if (amount < 0) {
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
                continue;
            }

            if(command.equals("add")) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
            }
            if (command.equals("move")) {
                if (amount <= first) {
                    first -= amount;
                    second += amount;
                } else {
                    second += first;
                    first = 0;
                }
                if (second > 100) {
                    second = 100;
                }
            }
            if (command.equals("remove")) {
                second -= amount;
                if (second < 0) {
                    second = 0;
                }
            }

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

        }
    }

}
