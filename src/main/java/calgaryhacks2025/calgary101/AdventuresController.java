package calgaryhacks2025.calgary101;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class AdventuresController {

    @FXML
    private VBox vboxAdventures;
    @FXML
    private Button btnCalgaryTower;
    @FXML
    private Button btnPeaceBridge;
    @FXML
    private Button btnCentralLibrary;
    @FXML
    private Button btnCalgaryZoo;
    @FXML
    private Button btnChinookMall;
    @FXML
    private Button btnMuseum;
    @FXML
    private Button btnStampede;
    private Color colour;
    private String[] logText=new String[4];

    @FXML
    private void initialize() throws FileNotFoundException {
        Button[] buttons = new Button[7];
        buttons[0] = btnCalgaryTower;
        buttons[1] = btnPeaceBridge;
        buttons[2] = btnCentralLibrary;
        buttons[3] = btnCalgaryZoo;
        buttons[4] = btnChinookMall;
        buttons[5] = btnMuseum;
        buttons[6] = btnStampede;


        try {
            File log = new File("src/main/java/calgaryhacks2025/calgary101/log");
            Scanner myReader = new Scanner(log);
            int count=0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                logText[count] = data;
                count++;
                if(data.contains("adventures")){
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
    private void handleCalgaryTower(ActionEvent event) {

        vboxAdventures.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 tower");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxAdventures.setSpacing(20);
        vboxAdventures.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnCalgaryTower,0);

    }

    @FXML
    private void handlePeaceBridge(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 the bridge");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxAdventures.setSpacing(20);
        vboxAdventures.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnPeaceBridge,1);

    }

    @FXML
    private void handleCentralLibrary(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 Rewards");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxAdventures.setSpacing(20);
        vboxAdventures.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnCentralLibrary,2);
    }

    @FXML
    private void handleCalgaryZoo(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 Fair Entry");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxAdventures.setSpacing(20);
        vboxAdventures.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnCalgaryZoo,3);
    }
    @FXML
    private void handleChinookMall(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 Uber");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxAdventures.setSpacing(20);
        vboxAdventures.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnChinookMall,4);
    }
    @FXML
    private void handleMuseum(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 Learn to drive");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxAdventures.setSpacing(20);
        vboxAdventures.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnMuseum,5);
    }

    @FXML
    private void handleStampede(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        Text txtTitle = new Text("\uD83D\uDE82 volunteer");
        txtTitle.setFont(Font.font("Rockwell",30));
        txtTitle.setFill(colour.web("#392A20"));

        Text txtBody = new Text(("Something\nOther Stuff\nYay"));
        txtBody.setFont(Font.font("Rockwell",16));
        txtBody.setFill(colour.web("#392A20"));
        txtBody.setLineSpacing(10);

        vboxAdventures.setSpacing(20);
        vboxAdventures.getChildren().addAll(txtTitle,txtBody);
        completeTask(btnStampede,6);
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

                    logText[2] = logText[2].substring(0,11+i) + '1'+logText[2].substring(12+i);
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
            vboxAdventures.getChildren().add(btnComplete);
        }



    }
}
