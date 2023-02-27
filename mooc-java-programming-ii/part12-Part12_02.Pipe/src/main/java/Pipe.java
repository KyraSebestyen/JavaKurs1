import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private final List<T> items = new ArrayList<>();

    public void putIntoPipe(T value) {
        items.add(value);
    }

    public T takeFromPipe() {
        if (items.isEmpty()) {
            return null;
        }
        T longestTimeInPipe = items.get(0);
        items.remove(0);
        return longestTimeInPipe;
    }

    public boolean isInPipe() {
        return ! items.isEmpty();
    }
}
