package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class VocabularyPracticeApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane layout = new VocabularyPracticeView().getView();
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
