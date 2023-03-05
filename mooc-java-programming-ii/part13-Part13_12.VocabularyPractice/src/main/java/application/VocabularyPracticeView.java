package application;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class VocabularyPracticeView {
    private final Dictionary dictionary = new Dictionary();
    public BorderPane getView() {
        InputView inputView = new InputView(dictionary);
        PracticeView practiceView = new PracticeView(dictionary);

        BorderPane layout = new BorderPane();
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");

        menu.getChildren().addAll(enterButton, practiceButton);
        layout.setTop(menu);

        enterButton.setOnAction((event) -> layout.setCenter(inputView.getView()));
        practiceButton.setOnAction((event) -> layout.setCenter(practiceView.getView()));

        layout.setCenter(inputView.getView());

        return layout;
    }
}
