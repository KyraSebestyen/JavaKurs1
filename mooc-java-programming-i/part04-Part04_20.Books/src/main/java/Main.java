import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while(true){
            System.out.println("Title:");
            String title = scanner.nextLine();

            if(title.isEmpty()){
                break;
            }

            System.out.println("Pages:");
            int numberOfPages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year:");
            int yearOfPublication = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, numberOfPages, yearOfPublication);
            books.add(book);
        }

        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        if(input.equals("everything")){
            for(Book book : books){
                System.out.println(book);
            }
        } else if(input.equals("name")){
            for(Book book : books){
                System.out.println(book.getTitle());
            }
        }

    }
}
