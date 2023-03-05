package application;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {
    private final Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }

    public Parent getView() {
        GridPane layout = new InputView(dictionary).styleGridPane();

        Label translateThis = new Label("Translate the word '" + this.word + "'");
        TextField wordInput = new TextField();
        Button check = new Button("Check");
        Label feedback = new Label("");

        layout.add(translateThis, 0, 0);
        layout.add(wordInput, 0, 1);
        layout.add(check, 0, 2);
        layout.add(feedback, 0, 3);

        check.setOnMouseClicked((event) -> {
            String input = wordInput.getText();
            if (input.equals(dictionary.getTranslations().get(this.word))) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! The translation of the word '" + this.word + "' is '"
                                            + dictionary.getTranslations().get(this.word) + "'.");
                return;
            }
            this.word = this.dictionary.getRandomWord();
            translateThis.setText("Translate the word '" + this.word + "'");
            wordInput.clear();
        });
       return layout;
    }

}
