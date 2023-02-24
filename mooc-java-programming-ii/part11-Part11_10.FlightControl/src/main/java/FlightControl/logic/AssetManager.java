package FlightControl.logic;

import FlightControl.domain.Flight;
import FlightControl.domain.Plane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssetManager {
    private final Map<String, Plane> planes = new HashMap<>();
    private final List<Flight> flights = new ArrayList<>();
    public void addPlane(Plane plane) {
        if (planes.containsKey(plane.getId())) {
            System.out.println("Plane already exists!");
        }
        if (plane.getCapacity() <= 0 || plane.getId().isEmpty()) {
            System.out.println("Invalid plane! Try again.");
        }
        planes.put(plane.getId(), plane);
    }

    public void addFlight(String planeID, String startID, String destinationID) {
        if (planes.containsKey(planeID)) {
            if (!startID.equals(destinationID)) {
                flights.add(new Flight(planes.get(planeID), startID, destinationID));
                return;
            }
        }
        System.out.println("Plane not found, please try again.");
    }

    public Map<String, Plane> getPlanes() {
        return planes;
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
