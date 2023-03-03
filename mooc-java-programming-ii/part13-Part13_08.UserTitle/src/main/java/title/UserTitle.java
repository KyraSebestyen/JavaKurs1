package title;


import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {
    @Override
    public void start(Stage primaryStage) {
        Parameters parameters = getParameters();
        String title = parameters.getNamed().get("input");
        primaryStage.setTitle(title);
        primaryStage.show();
    }
}
