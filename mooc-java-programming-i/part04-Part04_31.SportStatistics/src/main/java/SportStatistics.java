
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<Game> games = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                String firstName = parts[0];
                String secondName = parts[1];
                int firstPoints = Integer.parseInt(parts[2]);
                int secondPoints = Integer.parseInt(parts[3]);
                Game game = new Game(firstName, secondName, firstPoints, secondPoints);
                games.add(game);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Team:");
        String name = scan.nextLine();
        int gameCount = 0;
        int winCount = 0;

        for (Game game : games) {
            if (game.teamInGame(name)) {
                gameCount++;
                if (game.didTeamWin(name)) {
                    winCount++;
                }
            }
        }

        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + (gameCount - winCount));

    }

}
