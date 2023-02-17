public class Game {
    private String team1;
    private String team2;
    private int pointsOfTeam1;
    private int pointsOfTeam2;

    public Game(String team1, String team2, int pointsOfTeam1, int pointsOfTeam2) {
        this.team1 = team1;
        this.team2 = team2;
        this.pointsOfTeam1 = pointsOfTeam1;
        this.pointsOfTeam2 = pointsOfTeam2;
    }

    public boolean didTeamWin(String team) {
        if (teamInGame(team)) {
            if (team.equals(this.team1)) {
                return this.pointsOfTeam1 > this.pointsOfTeam2;
            } else if (team.equals(this.team2)) {
                return this.pointsOfTeam2 > this.pointsOfTeam1;
            }
        }
        return false;
    }

    public boolean teamInGame(String team) {
        return team.equals(this.team1) || team.equals(this.team2);
    }
}
