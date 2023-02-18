import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> licensePlateOwner = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!(licensePlateOwner.containsKey(licensePlate))) {
            licensePlateOwner.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return licensePlateOwner.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        return (licensePlateOwner.remove(licensePlate) != null);
    }

    public void printLicensePlates() {
        for(LicensePlate licensePlate : this.licensePlateOwner.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();
        for (String owner : licensePlateOwner.values()) {
            if (!printedOwners.contains(owner)) {
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }
    }
}
