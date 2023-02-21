import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserInterface {
    private List<Book> books = new ArrayList<>();
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();

            if(title.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            int ageRecommendation = Integer.parseInt(scanner.nextLine());

            this.books.add(new Book(title, ageRecommendation));
        }
    }

    public void printSorted() {
        System.out.println(this.books.size() + " books in total.");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getTitle);

        List<Book> sortedBooks = books.stream().sorted(comparator).collect(Collectors.toList());

        System.out.println("Books:");
        sortedBooks.forEach(System.out::println);
    }
}
