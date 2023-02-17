
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String nameOfTheOldest = "";

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] namesAndAges = input.split(",");
            int age = Integer.parseInt(namesAndAges[1]);
            String name = namesAndAges[0];
            if(age > oldest){
                oldest = age;
                nameOfTheOldest = name;
            }
        }
        System.out.println("Name of the oldest: " + nameOfTheOldest);


    }
}
