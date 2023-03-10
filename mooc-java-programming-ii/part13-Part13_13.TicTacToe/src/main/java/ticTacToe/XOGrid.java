package ticTacToe;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class XOGrid {
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
