package FlightControl.logic;

import FlightControl.domain.Flight;
import FlightControl.domain.Plane;

import java.util.List;
import java.util.Map;

public class InformationPrinter {
    private final Map<String, Plane> planes;
    private final List<Flight> flights;

    public InformationPrinter(Map<String, Plane> planes, List<Flight> flights) {
        this.planes = planes;
        this.flights = flights;
    }

    public void printAllFlights() {
        flights.forEach(System.out::println);
    }

    public void printAllPlanes() {
        planes.values().forEach(System.out::println);
    }

    public void printDetails(String id) {
        if (planes.containsKey(id)) {
            System.out.println(planes.get(id));
        }
    }
}
