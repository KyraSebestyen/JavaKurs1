import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(String value) {
        this.list.add(0, value);
    }

    public String take() {
        String onTop = this.list.get(0);
        this.list.remove(0);
        return onTop;
    }

    public ArrayList<String> values() {
        return this.list;
    }
}
