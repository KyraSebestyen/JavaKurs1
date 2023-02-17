public class Exam {
    private int lowerBound;
    private int upperBound;
    private int minimumForPassing;

    public Exam(int lowerBound, int upperBound, int minimumForPassing) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.minimumForPassing = minimumForPassing;
    }

    public boolean numberInInterval(int number) {
        return (number >= this.lowerBound && number <= this.upperBound);
    }

    public boolean passing(int number) {
        return number >= minimumForPassing;
    }

    public int convertPointsToGrade(int points) {
        if (points < 50) {
            return 0;
        }
        if (points < 60) {
            return 1;
        }
        if (points < 70) {
            return 2;
        }
        if (points < 80) {
            return 3;
        }
        if (points < 90) {
            return 4;
        }
        if (points <= 100) {
            return 5;
        }
        return -1;
    }
}
