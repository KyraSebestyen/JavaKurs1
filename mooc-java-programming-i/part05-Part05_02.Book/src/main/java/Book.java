public class Book {
    private String name;
    private String author;
    private int pages;

    public Book(String author, String name, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}
