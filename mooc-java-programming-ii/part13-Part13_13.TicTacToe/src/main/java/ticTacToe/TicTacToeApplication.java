package ticTacToe;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

import static ticTacToe.TicTacToeSign.O;
import static ticTacToe.TicTacToeSign.X;

public class TicTacToeApplication extends Application {
    private final XOGrid xoGrid = new XOGrid();
    private final List<Player> players = new ArrayList<>();
    private int indexOfPlayer = 0;
    private final Label turn = new Label("Turn: X");
    private final Label hasEnded = new Label("The end!");
    private final BorderPane layout = new BorderPane();

    public TicTacToeApplication() {
        Player xPlayer = new Player(X);
        Player oPlayer = new Player(O);
        players.add(xPlayer);
        players.add(oPlayer);
        layout.setPadding(new Insets(0, 0, 20, 0));
    }


    @Override
    public void start(Stage primaryStage) {
        List<Button>  buttons = xoGrid.getButtons();

        GridPane gridPane = this.xoGrid.makeGrid();

        layout.setCenter(gridPane);

        buttons.forEach(this::makeMove);

        layout.setTop(turn);

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void makeMove(Button button) {
        List<Button>  buttons = xoGrid.getButtons();
        button.setOnMouseClicked((event) -> {
            if (xoGrid.move(players.get(indexOfPlayer), button)) {
                changeIndexOfPlayer();
            }
            String whoseTurn = players.get(indexOfPlayer).sign.name();
            turn.setText("Turn: " + whoseTurn);

            if(this.xoGrid.gameHasEnded(buttons)) {
                layout.setBottom(hasEnded);
                buttons.forEach(btn -> btn.setDisable(true));
            }
        });
    }

    private void changeIndexOfPlayer() {
        if (this.indexOfPlayer == 0) {
            this.indexOfPlayer = 1;
        } else if (this.indexOfPlayer == 1) {
            this.indexOfPlayer = 0;
        }
    }



    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
