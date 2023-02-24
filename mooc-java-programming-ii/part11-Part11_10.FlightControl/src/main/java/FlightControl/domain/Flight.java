package FlightControl.domain;

public class Flight {
    private final Plane plane;
    private final String start;
    private final String destination;

    public Flight(Plane plane, String start, String destination) {
        this.plane = plane;
        this.start = start;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return plane.toString() + " (" + start + "-" + destination + ")";
    }
}
