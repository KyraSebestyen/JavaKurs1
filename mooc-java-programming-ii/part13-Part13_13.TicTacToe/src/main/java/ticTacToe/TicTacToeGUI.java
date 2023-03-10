package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.List;

public class TicTacToeGUI extends Application {
    private final XOGrid xoGrid = new XOGrid();
    private final Label turn = new Label("Turn: X");
    private final Label hasEnded = new Label("The end!");
    private final BorderPane layout = new BorderPane();
    private final Game game = new Game();

    public TicTacToeGUI() {
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
            if (game.isMoveValid(button)) {
                drawSign(button, game.getActivePlayer());
                game.changeTurn();
            }
            String whoseTurn = game.getActivePlayer().sign.name();
            turn.setText("Turn: " + whoseTurn);

            if(this.game.gameHasEnded(buttons)) {
                layout.setBottom(hasEnded);
                buttons.forEach(btn -> btn.setDisable(true));
            }
        });
    }

    private void drawSign(Button button, Player player) {
        button.setText(player.sign.name());
        button.setDisable(true);
    }

    public static void main(String[] args) {
        launch(TicTacToeGUI.class);
    }

}
