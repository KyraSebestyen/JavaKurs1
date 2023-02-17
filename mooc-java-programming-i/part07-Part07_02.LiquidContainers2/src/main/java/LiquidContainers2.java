
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        System.out.println("First: " + firstContainer);
        System.out.println("Second: " + secondContainer);

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] commandAndAmount = input.split(" ");
            String command = commandAndAmount[0];
            int amount = Integer.parseInt(commandAndAmount[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            }
            if (command.equals("move")) {
                if (firstContainer.contains() >= amount) {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                } else {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(amount);
                }
            }
            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
        }

    }

}
