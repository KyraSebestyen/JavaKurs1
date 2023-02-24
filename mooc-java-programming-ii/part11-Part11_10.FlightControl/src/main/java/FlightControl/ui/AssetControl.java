package FlightControl.ui;

public class AssetControl {
    String quitCommand = "x";
    String addPlaneCommand = "1";
    String addFlightCommand = "2";

    public void start() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
    }

    public void listOptions() {
        System.out.println("Choose an action:\n" +
                           "[1] Add an airplane\n" +
                           "[2] Add a flight\n" +
                           "[x] Exit Airport Asset Control\n" +
                           "> ");
    }

}
