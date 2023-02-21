public class LiteracyData implements Comparable<LiteracyData> {
    private String gender;
    private String country;
    private int year;
    private double percentage;

    public LiteracyData(String gender, String country, int year, double percentage) {
        if (gender.contains("female")) {
            this.gender = "female";
        } else if (gender.contains("male")) {
            this.gender = "male";
        } else {
            this.gender = "other";
        }
        this.country = country;
        this.year = year;
        this.percentage = percentage;
    }

    @Override
    public int compareTo(LiteracyData o) {
        return Double.compare(this.percentage, o.percentage);
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.percentage;
    }
}
