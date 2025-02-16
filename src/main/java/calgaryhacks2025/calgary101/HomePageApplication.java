package calgaryhacks2025.calgary101;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    //why
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HomePageApplication.class.getResource("homePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setTitle("Calgary 101");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
