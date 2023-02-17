
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int start = 0;
        int end = Integer.valueOf(scanner.nextLine());

        while(start < end){
            start++;
            printText();
        }
    }
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
