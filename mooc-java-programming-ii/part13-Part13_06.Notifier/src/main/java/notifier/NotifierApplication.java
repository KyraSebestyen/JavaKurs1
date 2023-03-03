package notifier;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox layout = new VBox();
        layout.setSpacing(10);

        final TextField textField = new TextField();
        Button button = new Button("Update");
        Label text = new Label();

        button.setOnAction((event) -> {
            text.setText(textField.getText());
        });

        layout.getChildren().addAll(textField, button, text);

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
