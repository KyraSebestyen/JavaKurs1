import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private List<Bird> observedBirds = new ArrayList<>();


    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String input = this.scanner.nextLine();
            if (input.equals("Quit")) {
                break;
            }
            if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = this.scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = this.scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                this.observedBirds.add(bird);
            }
            if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String name = this.scanner.nextLine();
                boolean isBird = false;
                for (Bird bird : this.observedBirds) {
                    if (bird.getName().equals(name)) {
                        bird.increaseObserved();
                        isBird = true;
                    }
                }
                if (!isBird) {
                    System.out.println("Not a bird!");
                }
            }
            if (input.equals("All")) {
                for (Bird bird : this.observedBirds) {
                    System.out.println(bird);
                }
            }
            if (input.equals("One")) {
                System.out.print("Bird? ");
                String name = this.scanner.nextLine();
                for (Bird bird : this.observedBirds) {
                    if (bird.getName().equals(name)) {
                        System.out.println(bird);
                    }
                }
            }
        }
    }
}
