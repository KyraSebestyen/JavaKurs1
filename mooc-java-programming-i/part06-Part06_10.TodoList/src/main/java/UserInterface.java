import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add:");
                String toAdd = this.scanner.nextLine();
                this.todoList.add(toAdd);
                continue;
            }
            if (command.equals("list")) {
                this.todoList.print();
                continue;
            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int toRemove = Integer.parseInt(this.scanner.nextLine());
                this.todoList.remove(toRemove);
                continue;
            }
        }
    }
}
