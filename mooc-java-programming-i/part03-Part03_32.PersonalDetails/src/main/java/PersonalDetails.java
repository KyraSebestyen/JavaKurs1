
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int yearCount = 0;
        String longestName = "";

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] nameAndYear = input.split(",");
            String name = nameAndYear[0];
            if(name.length() > longestName.length()){
                longestName = name;
            }
            int year = Integer.parseInt(nameAndYear[1]);
            sum += year;
            yearCount++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / yearCount));
    }
}
