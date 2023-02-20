import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> individuals = new ArrayList<>();

    public void addToHerd(Movable movable) {
        individuals.add(movable);
    }
    @Override
    public void move(int dx, int dy) {
        for (Movable individual : individuals) {
            individual.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable individual : individuals) {
            sb.append(individual.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
