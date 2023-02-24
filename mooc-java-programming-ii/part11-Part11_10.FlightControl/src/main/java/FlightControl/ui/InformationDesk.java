package FlightControl.ui;

public class InformationDesk {
    String quitCommand = "x";
    String printPlanesCommand = "1";
    String printFlightsCommand = "2";
    String printPlaneDetailsCommand = "3";

    public void start() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
    }
    public void listOptions() {
        System.out.println("Choose an action:\n" +
                           "[1] Print airplanes\n" +
                           "[2] Print flights\n" +
                           "[3] Print airplane details\n" +
                           "[x] Quit\n" +
                           "> ");
    }
}
