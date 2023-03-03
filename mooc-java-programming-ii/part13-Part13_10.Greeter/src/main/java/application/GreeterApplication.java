package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    @Override
    public void start(final Stage primaryStage) {
        Label instructionText = new Label("Enter your name and start.");
        TextField nameField = new TextField();
        Button startButton = new Button("Start");

        GridPane firstLayout = new GridPane();
        firstLayout.add(instructionText, 0, 0);
        firstLayout.add(nameField, 0, 1);
        firstLayout.add(startButton, 0, 2);
        firstLayout.setPrefSize(300, 180);
        firstLayout.setAlignment(Pos.CENTER);
        firstLayout.setVgap(10);
        firstLayout.setHgap(10);
        firstLayout.setPadding(new Insets(20, 20, 20, 20));


        final Scene firstView = new Scene(firstLayout);
        primaryStage.setScene(firstView);

        startButton.setOnAction((event) -> {
            final BorderPane secondLayout = new BorderPane();
            final Scene secondView = new Scene(secondLayout);
            secondLayout.setCenter(new Label("Welcome " + nameField.getText() + "!"));
            primaryStage.setScene(secondView);
        });

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
