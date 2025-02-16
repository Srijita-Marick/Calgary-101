package calgaryhacks2025.calgary101;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SideQuestsController {

    @FXML
    private VBox vboxSQ;
    @FXML
    private Button btnTransitPass;
    @FXML
    private Button btnLibraryCard;
    @FXML
    private Button btnRewardsCards;
    @FXML
    private Button btnFairEntry;
    @FXML
    private Button btnUber;
    @FXML
    private Button btnDriversLicense;
    @FXML
    private Button btnVolunteer;
    private Color colour;
    private String[] logText=new String[4];

    @FXML
    private void initialize() throws FileNotFoundException {
        Button[] buttons = new Button[7];
        buttons[0] = btnTransitPass;
        buttons[1] = btnLibraryCard;
        buttons[2] = btnRewardsCards;
        buttons[3] = btnFairEntry;
        buttons[4] = btnUber;
        buttons[5] = btnDriversLicense;
        buttons[6] = btnVolunteer;


        try {
            File log = new File("src/main/java/calgaryhacks2025/calgary101/log");
            Scanner myReader = new Scanner(log);
            int count=0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                logText[count] = data;
                count++;
                if(data.contains("sidequests")){
                    String bin = data.substring(11);
                    int i=0;
                    for (Button button :buttons){
                        if (bin.charAt(i) == '1'){
                            button.setStyle("-fx-background-color: green");
                            button.setText("Completed");
                        }
                        i++;
                    }
                }
            }
            myReader.close();
        }catch (FileNotFoundException e){

        }

    }
    @FXML
    private void handleReturnButton(ActionEvent event) {
        vboxSQ.getChildren().clear();
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
    private void handleTransitPass(ActionEvent event) {

        vboxSQ.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 Transit Pass");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxSQ.setSpacing(20);
        vboxSQ.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnTransitPass,0);

    }

    @FXML
    private void handleLibraryCard(ActionEvent event) {
        vboxSQ.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 Library Card");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxSQ.setSpacing(20);
        vboxSQ.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnLibraryCard,1);

    }

    @FXML
    private void handleRewardsCards(ActionEvent event) {
        vboxSQ.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 Rewards");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxSQ.setSpacing(20);
        vboxSQ.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnRewardsCards,2);
    }

    @FXML
    private void handleFairEntry(ActionEvent event) {
        vboxSQ.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 Fair Entry");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxSQ.setSpacing(20);
        vboxSQ.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnFairEntry,3);
    }
    @FXML
    private void handleUber(ActionEvent event) {
        vboxSQ.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 Uber");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxSQ.setSpacing(20);
        vboxSQ.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnUber,4);
    }
    @FXML
    private void handleDriversLicense(ActionEvent event) {
        vboxSQ.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 Learn to drive");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxSQ.setSpacing(20);
        vboxSQ.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnDriversLicense,5);
    }

    @FXML
    private void handleVolunteer(ActionEvent event) {
        vboxSQ.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 volunteer");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxSQ.setSpacing(20);
        vboxSQ.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnVolunteer,6);
    }


    @FXML
    private void completeTask(Button button, int i){
        if (!button.getStyle().equals("-fx-background-color: green")){
            Button btnComplete = new Button("Complete Task");
            btnComplete.setStyle("-fx-background-color: brown");
            btnComplete.setFont(Font.font("Rockwell",16));
            btnComplete.setTextFill(Paint.valueOf("white"));
            btnComplete.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    btnComplete.setVisible(false);
                    button.setStyle("-fx-background-color: green");
                    button.setText("Completed");

                    completeTask(button,0);
                    logText[1] = logText[1].substring(0,11+i) + '1'+logText[1].substring(12+i);
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/calgaryhacks2025/calgary101/log"));
                        for (String line : logText){
                            writer.write(line);
                            writer.write("\n");
                        }
                        writer.close();
                    } catch (IOException ioe) {
                        System.out.println("Couldn't write to file");
                    }
                }
            });
            vboxSQ.getChildren().add(btnComplete);
        }



    }


}
