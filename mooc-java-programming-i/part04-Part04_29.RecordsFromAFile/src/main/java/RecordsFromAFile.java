
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String[] nameAndAge = reader.nextLine().split(",");
                String name = nameAndAge[0];
                int age = Integer.parseInt(nameAndAge[1]);
                names.add(name);
                ages.add(age);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < names.size(); i++) {
            int age = ages.get(i);
            if (age == 1) {
                System.out.println(names.get(i) + ", age: " + age + " year");
            } else {
                System.out.println(names.get(i) + ", age: " + age + " years");
            }
        }

    }
}
