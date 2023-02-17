
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        System.out.println("First: " + firstContainer + "/100");
        System.out.println("Second: " + secondContainer + "/100");

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
                continue;
            }

            if (command.equals("add")) {
                firstContainer += amount;
                if (firstContainer > 100) {
                    firstContainer = 100;
                }
            }
            if (command.equals("move")) {
                if (firstContainer >= amount) {
                    firstContainer -= amount;
                    secondContainer += amount;
                    if (secondContainer > 100) {
                        secondContainer = 100;
                    }
                } else {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                }

            }
            if (command.equals("remove")) {
                secondContainer -= amount;
                if (secondContainer < 0) {
                    secondContainer = 0;
                }
            }
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
        }
    }

}
