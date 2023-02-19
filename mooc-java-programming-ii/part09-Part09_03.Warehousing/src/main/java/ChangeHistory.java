import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changes = new ArrayList<>();
    public void add(double status) {
        this.changes.add(status);
    }

    public void clear() {
        this.changes.clear();
    }

    public double maxValue() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        double max = Double.MIN_VALUE;
        for (double number : this.changes) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.changes.isEmpty()) {
            return 0;
        }
        double min = Double.MAX_VALUE;
        for (double number : this.changes) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0;
        for (double number : this.changes) {
            sum += number;
        }
        return sum / this.changes.size();
    }

    @Override
    public String toString() {
        return changes.toString();
    }
}
