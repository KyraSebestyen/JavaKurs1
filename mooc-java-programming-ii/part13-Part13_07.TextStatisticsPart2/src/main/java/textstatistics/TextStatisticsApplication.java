package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TextStatisticsApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();

        TextArea textField = new TextArea();
        layout.setCenter(textField);

        HBox horizontal = new HBox();
        Label textLetterCount = new Label("Letters: 0");
        Label textWordCount = new Label("Words: 0");
        Label textLongestWord = new Label("The longest word is: ");

        horizontal.setSpacing(20);
        horizontal.getChildren().addAll(textLetterCount, textWordCount, textLongestWord);

        layout.setBottom(horizontal);

        textField.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts).min((s1, s2) -> s2.length() - s1.length())
                    .orElse("");
            textLetterCount.setText("Letters: " + characters);
            textWordCount.setText("Words: " + words);
            textLongestWord.setText("The longest word is: " + longest);
        });


        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
