
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {
    
    public static void main(String[] args) {
        List<Book> books = readBooks("src/main/books");
        books.forEach(System.out::println);
    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(line -> line.split(",")) // Zeile in einzelne Buchbestandteile aufteilen
                    .filter(bookParts -> bookParts.length == 4) // nur Zeilen mit allen Bestandteilen
                    .map(bookParts -> new Book(bookParts[0], Integer.parseInt(bookParts[1]), Integer.parseInt(bookParts[2]), bookParts[3]))
                    .forEach(book -> books.add(book));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return books;
    }

}
