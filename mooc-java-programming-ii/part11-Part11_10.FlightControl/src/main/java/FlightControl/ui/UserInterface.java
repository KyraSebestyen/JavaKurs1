package FlightControl.ui;

import FlightControl.domain.Plane;
import FlightControl.logic.AssetManager;
import FlightControl.logic.InformationPrinter;

import java.util.Scanner;

public class UserInterface {
    private final AssetControl assetControl = new AssetControl();
    private final InformationDesk informationDesk = new InformationDesk();
    private final AssetManager assetManager = new AssetManager();
    private final InformationPrinter informationPrinter;
    private final Scanner scanner = new Scanner(System.in);

    public UserInterface() {
        this.informationPrinter = new InformationPrinter(assetManager.getPlanes(), assetManager.getFlights());
    }

    public void start() {
        assetControl.start();
        while (true) {
            assetControl.listOptions();
            String command = scanner.nextLine();

            if (command.equals(assetControl.quitCommand)) {
                break;
            }
            if (command.equals(assetControl.addPlaneCommand)) {
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                while (id.isEmpty()) {
                    System.out.println("Please give an id: ");
                    id = scanner.nextLine();
                }
                System.out.println("Give the airplane capacity: ");
                int capacity = 0;
                while (capacity <= 0) {
                    try {
                        capacity = Integer.parseInt(scanner.nextLine());
                        if (capacity <= 0) {
                            System.out.println("Please give a number greater than 0: ");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please give a number: ");
                    }
                }
                assetManager.addPlane(new Plane(id, capacity));
                continue;
            }
            if (command.equals(assetControl.addFlightCommand)) {
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.println("Give the departure airport id: ");
                String start = scanner.nextLine();
                System.out.println("Give the target airport id: ");
                String destination = scanner.nextLine();
                assetManager.addFlight(id, start, destination);
                continue;
            }
            System.out.println("Invalid command!");
        }
        informationDesk.start();
        while (true) {
            informationDesk.listOptions();
            String command = scanner.nextLine();

            if (command.equals(informationDesk.quitCommand)) {
                break;
            }

            if (command.equals(informationDesk.printPlanesCommand)) {
                informationPrinter.printAllPlanes();
                continue;
            }
            if (command.equals(informationDesk.printFlightsCommand)) {
                informationPrinter.printAllFlights();
                continue;
            }
            if (command.equals(informationDesk.printPlaneDetailsCommand)) {
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                informationPrinter.printDetails(id);
                continue;
            }
            System.out.println("Invalid command!");
        }
    }
}
