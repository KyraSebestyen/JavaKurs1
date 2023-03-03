package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    @Override
    public void start(final Stage primaryStage) {
        BorderPane firstLayout = new BorderPane();
        firstLayout.setTop(new Label("First view!"));
        Button buttonToSecond = new Button("To the second view!");
        firstLayout.setCenter(buttonToSecond);

        VBox secondLayout = new VBox();
        Button buttonToThird = new Button("To the third view!");
        Label textIsSecond = new Label("Second view!");
        secondLayout.getChildren().addAll(buttonToThird, textIsSecond);

        GridPane thirdLayout = new GridPane();
        thirdLayout.add(new Label("Third view!"), 0, 0);
        Button buttonToFirst = new Button("To the first view!");
        thirdLayout.add(buttonToFirst, 1, 1);

        Scene first = new Scene(firstLayout);
        final Scene second = new Scene(secondLayout);
        Scene third = new Scene(thirdLayout);

        buttonToSecond.setOnAction((event) -> {
            primaryStage.setScene(second);
        });

        buttonToThird.setOnAction((event) -> {
            primaryStage.setScene(third);
        });

        buttonToFirst.setOnAction((event) -> {
            primaryStage.setScene(first);
        });

        primaryStage.setScene(first);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
