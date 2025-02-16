package calgaryhacks2025.calgary101;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

public class EssentialsController {

    @FXML
    private VBox vBoxEssentials;

    @FXML
    private void handleReturnButton(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("homePage.fxml"));
        Parent root;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handlePhnButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        Text heading = new Text("☎ Registerin’ Your Ranch Line");
        heading.setFont(Font.font("Rockwell", 24));
        heading.setFill(Color.web("#392A20"));

        vBoxEssentials.setSpacing(10);
        vBoxEssentials.getChildren().add(heading);
    }

    @FXML
    private void handleResButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        Text heading = new Text("\uD83C\uDFE1 Secure Your Homestead");
        heading.setFont(Font.font("Rockwell", 24));
        heading.setFill(Color.web("#392A20"));

        vBoxEssentials.setSpacing(10);
        vBoxEssentials.getChildren().add(heading);
    }

    @FXML
    private void handleHealthCButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        Text heading = new Text("⛨ Cowboy’s Insurance");
        heading.setFont(Font.font("Rockwell", 24));
        heading.setFill(Color.web("#392A20"));

        vBoxEssentials.setSpacing(10);
        vBoxEssentials.getChildren().add(heading);
    }

    @FXML
    private void handleSINButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        Text heading = new Text("\uD83D\uDCDD Sheriff’s Records");
        heading.setFont(Font.font("Rockwell", 24));
        heading.setFill(Color.web("#392A20"));

        vBoxEssentials.setSpacing(10);
        vBoxEssentials.getChildren().add(heading);
    }

    @FXML
    private void handleBankingButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        Text heading = new Text("\uD83D\uDCB0 Stashin’ Your Gold");
        heading.setFont(Font.font("Rockwell", 24));
        heading.setFill(Color.web("#392A20"));

        vBoxEssentials.setSpacing(10);
        vBoxEssentials.getChildren().add(heading);
    }

    @FXML
    private void handleAlbertaIDButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        Text heading = new Text("\uD83C\uDF32 The Town Registry");
        heading.setFont(Font.font("Rockwell", 24));
        heading.setFill(Color.web("#392A20"));

        vBoxEssentials.setSpacing(10);
        vBoxEssentials.getChildren().add(heading);
    }

    @FXML
    private void handleEmergencyListButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        Text heading = new Text("\uD83D\uDE91 Frontier Lifeline");
        heading.setFont(Font.font("Rockwell", 24));
        heading.setFill(Color.web("#392A20"));

        vBoxEssentials.setSpacing(10);
        vBoxEssentials.getChildren().add(heading);
    }
}
