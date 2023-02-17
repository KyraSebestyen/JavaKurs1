
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String firstRow = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            return firstRow + " is empty.";
        }
        int numberOfElements = this.elements.size();
        String elementsInCollection = "";

        if (numberOfElements == 1) {
            firstRow = firstRow + " has 1 element:\n";
            return firstRow + elements.get(0);
        }
        firstRow = firstRow + " has " + numberOfElements + " elements:\n";
        for (String element : this.elements) {
            elementsInCollection = elementsInCollection + element + "\n";
        }
        return firstRow + elementsInCollection;
    }
}
