package ticTacToe;

import javafx.scene.control.Button;
import java.util.List;

public class Game {
    private final PlayerManagement playerManagement = new PlayerManagement();

    public boolean isMoveValid(Button button) {
        return !button.isDisabled();
    }

    public boolean gameHasEnded(List<Button> buttons) {
        List<List<Integer>> validCombinations = Combinations.getValidCombinations();

        return validCombinations.stream()
                .anyMatch(combination -> {
                    return !buttons.get(combination.get(0)).getText().trim().isEmpty()
                           && buttons.get(combination.get(0)).getText().equals(buttons.get(combination.get(1)).getText())
                           && buttons.get(combination.get(1)).getText().equals(buttons.get(combination.get(2)).getText());
                });

    }

    public Player getActivePlayer() {
        return playerManagement.getActivePlayer();
    }

    public void changeTurn() {
        playerManagement.changeActivePlayer();
    }
}
