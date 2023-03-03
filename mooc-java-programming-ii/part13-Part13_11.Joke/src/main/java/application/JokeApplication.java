package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();

        Button showQuestion = new Button("Joke");
        Button showAnswer = new Button("Answer");
        Button showExplanation = new Button("Explanation");

        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        menu.getChildren().addAll(showQuestion, showAnswer, showExplanation);

        layout.setTop(menu);

        StackPane question = createView("What do you call a bear with no teeth?");
        StackPane answer = createView("A gummy bear.");
        StackPane explanation = createView("That's funny because a gummy bear is not an animal.");

        layout.setCenter(question);

        showQuestion.setOnAction((event) -> {
            layout.setCenter(question);
        });

        showAnswer.setOnAction((event) -> {
            layout.setCenter(answer);
        });

        showExplanation.setOnAction((event) -> {
            layout.setCenter(explanation);
        });

        Scene scene = new Scene(layout);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(500, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        return layout;
    }


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
