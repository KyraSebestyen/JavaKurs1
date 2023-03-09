package ticTacToe;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class XOGrid {
    private final Player player1 = new Player(TicTacToeSign.X);
    private final Player player2 = new Player(TicTacToeSign.O);
    private final List<ButtonWrapper> buttonWrappers;

    public XOGrid() {
        buttonWrappers = IntStream
                .range(0, 9)
                .mapToObj(number -> new ButtonWrapper((number / 3), (number % 3), makeFormattedButton()))
                .collect(Collectors.toList());
    }

    public GridPane makeGrid() {
        GridPane xOGrid = new GridPane();
        buttonWrappers.forEach(buttonWrapper -> xOGrid.add(buttonWrapper.button, buttonWrapper.row, buttonWrapper.column));
        return xOGrid;
    }

    public boolean move(Player player, Button button) {
        if (button.isDisabled()) {
            return false;
        }
        drawSign(button, player);
        return true;
    }

    private void drawSign(Button button, Player player) {
        button.setText(player.sign.name());
        button.setDisable(true);
    }

    public boolean gameHasEnded(List<Button> buttons) {
        List<List<Integer>> validCombinations = new ArrayList<>();
        List<Integer> combinationFirstRow = new ArrayList<>();
        combinationFirstRow.add(0);
        combinationFirstRow.add(1);
        combinationFirstRow.add(2);

        List<Integer> combinationSecondRow = new ArrayList<>();
        combinationSecondRow.add(3);
        combinationSecondRow.add(4);
        combinationSecondRow.add(5);

        List<Integer> combinationThirdRow = new ArrayList<>();
        combinationThirdRow.add(6);
        combinationThirdRow.add(7);
        combinationThirdRow.add(8);

        List<Integer> combinationFirstColumn = new ArrayList<>();
        combinationFirstColumn.add(0);
        combinationFirstColumn.add(3);
        combinationFirstColumn.add(6);

        List<Integer> combinationSecondColumn = new ArrayList<>();
        combinationSecondColumn.add(1);
        combinationSecondColumn.add(4);
        combinationSecondColumn.add(7);

        List<Integer> combinationThirdColumn = new ArrayList<>();
        combinationThirdColumn.add(2);
        combinationThirdColumn.add(5);
        combinationThirdColumn.add(8);

        List<Integer> combinationFirstDiagonal = new ArrayList<>();
        combinationFirstDiagonal.add(0);
        combinationFirstDiagonal.add(4);
        combinationFirstDiagonal.add(8);

        List<Integer> combinationSecondDiagonal = new ArrayList<>();
        combinationSecondDiagonal.add(6);
        combinationSecondDiagonal.add(4);
        combinationSecondDiagonal.add(2);

        validCombinations.add(combinationFirstRow);
        validCombinations.add(combinationSecondRow);
        validCombinations.add(combinationThirdRow);
        validCombinations.add(combinationFirstColumn);
        validCombinations.add(combinationSecondColumn);
        validCombinations.add(combinationThirdColumn);
        validCombinations.add(combinationFirstDiagonal);
        validCombinations.add(combinationSecondDiagonal);

        return validCombinations.stream()
                .anyMatch(combination -> {
                    return !buttons.get(combination.get(0)).getText().trim().isEmpty()
                           && buttons.get(combination.get(0)).getText().equals(buttons.get(combination.get(1)).getText())
                           && buttons.get(combination.get(1)).getText().equals(buttons.get(combination.get(2)).getText());
                });

    }

    private Button makeFormattedButton() {
        Button button = new Button(" ");
        button.setFont(Font.font("Monospaced", 40));
        return button;
    }

    public List<Button> getButtons() {
        List<Button> buttons = new ArrayList<>();
        buttonWrappers.forEach(buttonWrapper -> buttons.add(buttonWrapper.button));
        return buttons;
    }

    private static class ButtonWrapper {
        private final int row;
        private final int column;
        private final Button button;

        public ButtonWrapper(int row, int column, Button button) {
            this.row = row;
            this.column = column;
            this.button = button;
        }
    }

}
