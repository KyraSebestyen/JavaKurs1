
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.items.add(Item);
    }

    public int totalWeight() {
        return this.items.stream()
                .mapToInt(Item::getWeight)
                .sum();
    }

    public void printItems() {
        this.items.forEach(System.out::println);
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        return this.items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
