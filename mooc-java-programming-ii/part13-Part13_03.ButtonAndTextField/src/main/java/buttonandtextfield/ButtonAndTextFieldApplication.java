package buttonandtextfield;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {
    @Override
    public void start(Stage window) {
        Button button = new Button("Click here");
        TextField text = new TextField("I am a text field");

        FlowPane components = new FlowPane();
        components.getChildren().add(button);
        components.getChildren().add(text);

        Scene view = new Scene(components);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
