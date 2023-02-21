public class Book {
    private String title;
    private int ageRecommendation;

    public Book(String title, int ageRecommendation) {
        this.title = title;
        this.ageRecommendation = ageRecommendation;
    }

    public String getTitle() {
        return title;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    @Override
    public String toString() {
        return this.title + " (recommended for " + this.ageRecommendation + " year-olds or older)";
    }
}
