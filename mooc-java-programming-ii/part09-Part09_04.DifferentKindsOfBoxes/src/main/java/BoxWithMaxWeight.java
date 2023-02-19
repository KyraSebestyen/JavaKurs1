import java.util.ArrayList;
import java.util.List;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private List<Item> items = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        int weight = 0;
        for (Item i : this.items) {
            weight += i.getWeight();
        }
        if (this.capacity >= (weight + item.getWeight())) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
