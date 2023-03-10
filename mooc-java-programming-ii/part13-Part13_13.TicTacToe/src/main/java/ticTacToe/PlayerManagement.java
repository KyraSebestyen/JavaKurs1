package ticTacToe;

public class PlayerManagement {
    private Player activePlayer;
    private final Player xPlayer = new Player(Player.TicTacToeSign.X);
    private final Player oPlayer = new Player(Player.TicTacToeSign.O);

    public PlayerManagement() {
        this.activePlayer = xPlayer;
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public void changeActivePlayer() {
        if (this.activePlayer == xPlayer) {
            this.activePlayer = oPlayer;
        } else if (this.activePlayer == oPlayer) {
            this.activePlayer = xPlayer;
        }
    }
}
