import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {
    private List<Packable> items = new ArrayList<>();
    private double maxWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= maxWeight) {
            items.add(item);
        }
    }
    @Override
    public double weight() {
        double sum = 0;
        for(Packable item : items) {
            sum += item.weight();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
