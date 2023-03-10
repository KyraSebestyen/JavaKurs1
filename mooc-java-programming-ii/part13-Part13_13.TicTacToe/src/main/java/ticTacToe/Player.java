package ticTacToe;

public class Player {
    TicTacToeSign sign;

    public Player(TicTacToeSign sign) {
        this.sign = sign;
    }

    public enum TicTacToeSign {
        X, O
    }
}
