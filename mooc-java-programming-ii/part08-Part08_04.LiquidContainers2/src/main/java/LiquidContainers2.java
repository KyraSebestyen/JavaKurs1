
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        System.out.println("First: " + first);
        System.out.println("Second: " + second);

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
                first.add(amount);
            }
            if (command.equals("move")) {
                if (amount <= first.contains()) {
                    second.add(amount);
                } else {
                    second.add(first.contains());
                }
                first.remove(amount);
            }
            if (command.equals("remove")) {
                second.remove(amount);
            }
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
        }
    }

}
