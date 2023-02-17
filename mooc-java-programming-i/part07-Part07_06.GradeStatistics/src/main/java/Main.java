
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exam exam = new Exam(0, 100, 50);
        UserInterface ui = new UserInterface(scanner, exam);

        ui.start();

    }
}
