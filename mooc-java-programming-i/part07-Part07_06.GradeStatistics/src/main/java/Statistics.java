public class Statistics {
    private int count;
    private int countOfPassing;
    private int sum;
    private int sumOfPassing;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        this.countOfPassing = 0;
        this.sumOfPassing = 0;
    }

    public double average() {
        if (sum == 0) {
            return -1.0;
        }
        return (sum * 1.0 / count);
    }

    public double averagePassing() {
        if (this.sumOfPassing == 0) {
            return -1.0;
        }
        return (this.sumOfPassing * 1.0 / this.countOfPassing);
    }

    public double passPercentage() {
        return 100.0 * this.countOfPassing / this.count;
    }

    public void increaseCount() {
        this.count++;
    }

    public void increaseCountOfPassing() {
        this.countOfPassing++;
    }

    public void increaseSum(int amount) {
        this.sum += amount;
    }

    public void increaseSumOfPassing(int amount) {
        this.sumOfPassing += amount;
    }

    public int getCount() {
        return count;
    }

    public int getSum() {
        return sum;
    }

    public int getCountOfPassing() {
        return countOfPassing;
    }

    public int getSumOfPassing() {
        return sumOfPassing;
    }
}
