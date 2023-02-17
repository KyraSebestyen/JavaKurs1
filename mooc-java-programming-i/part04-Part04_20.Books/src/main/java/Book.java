public class Book {
    private String title;
    private int numberOfPages;
    private int yearOfPublication;

    public Book(String title, int numberOfPages, int yearOfPublication) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return this.title + ", " + this.numberOfPages + " pages, " + this.yearOfPublication;
    }
}
