package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InputView extends Application {
    private final Dictionary dictionary = new Dictionary();
    @Override
    public void start(Stage primaryStage) {
        GridPane layout = styleGridPane();

        Label word = new Label("Word");
        TextField wordField = new TextField();
        Label translation = new Label("Translation");
        TextField translationField = new TextField();
        Button add = new Button("Add the word pair");
        layout.add(word, 0, 0);
        layout.add(wordField, 0, 1);
        layout.add(translation, 0, 2);
        layout.add(translationField, 0, 3);
        layout.add(add, 0, 4);

        add.setOnMouseClicked((event) -> {
            this.dictionary.addTranslation(wordField.getText(), translationField.getText());
            wordField.clear();
            translationField.clear();
            dictionary.printAllTranslations();
        });

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private GridPane styleGridPane() {
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        return layout;
    }

    public static void main(String[] args) {
        launch(InputView.class);

    }
}
