import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> unitAndItems = new HashMap<>();
    public void add(String unit, String item) {
        unitAndItems.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> items = unitAndItems.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return unitAndItems.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = unitAndItems.getOrDefault(storageUnit, new ArrayList<>());
        items.remove(item);
        if (items.isEmpty()) {
            unitAndItems.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsWithItems = new ArrayList<>();
        for (String unit : unitAndItems.keySet()) {
            if (unitAndItems.get(unit).isEmpty()) {
                continue;
            }
            unitsWithItems.add(unit);
        }
        return unitsWithItems;
    }
}

