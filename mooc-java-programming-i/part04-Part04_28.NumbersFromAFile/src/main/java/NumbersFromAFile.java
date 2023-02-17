
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                int number = Integer.parseInt(reader.nextLine());
                numbers.add(number);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int count = 0;

        for (Integer number : numbers) {
            if (number >= lowerBound && number <= upperBound) {
                count++;
            }
        }
        System.out.println("Numbers: " + count);

    }
}
