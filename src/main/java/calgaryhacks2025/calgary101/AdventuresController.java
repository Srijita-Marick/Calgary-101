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
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
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

    private Text createText(String content, int fontSize, String colorHex, double wrappingWidth, TextAlignment alignment, boolean bold) {
        Text text = new Text(content);
        if (bold) {
            text.setFont(Font.font("Rockwell", FontWeight.BOLD, fontSize));
        }
        else {
            text.setFont(Font.font("Rockwell", fontSize));
        }
        text.setFill(Color.web(colorHex));
        text.setWrappingWidth(wrappingWidth);
        text.setTextAlignment(alignment);
        return text;
    }

    @FXML
    private void handleCalgaryTower(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDE82 tower", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Take a trip to the Calgary Tower for stunning panoramic views of the city and the surrounding mountains. Don’t forget to check out the Glass Floor for an extra thrill!", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxAdventures.setSpacing(7);
        vboxAdventures.getChildren().addAll(heading, content, space);
        completeTask(btnCalgaryTower,0);

    }

    @FXML
    private void handlePeaceBridge(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDE82 bridge", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Stroll across the Peace Bridge, a beautiful pedestrian bridge with vibrant red arches that crosses the Bow River. It’s a great spot for photos and enjoying the scenic view of downtown Calgary.", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxAdventures.setSpacing(7);
        vboxAdventures.getChildren().addAll(heading, content, space);
        completeTask(btnPeaceBridge,1);

    }

    @FXML
    private void handleCentralLibrary(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDE82 library", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Check out the stunning Central Library, a hub for books, events, and community activities. The architecture alone is worth the visit!", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxAdventures.setSpacing(7);
        vboxAdventures.getChildren().addAll(heading, content, space);
        completeTask(btnCentralLibrary,2);
    }

    @FXML
    private void handleCalgaryZoo(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDE82 zoo", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Visit the Calgary Zoo to see a variety of animals from around the world. It’s a fun, educational adventure for animal lovers and families alike.", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxAdventures.setSpacing(7);
        vboxAdventures.getChildren().addAll(heading, content, space);
        completeTask(btnCalgaryZoo,3);
    }
    @FXML
    private void handleChinookMall(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDE82 mall", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Head over to Chinook Mall, one of Calgary’s largest shopping destinations, offering a wide range of stores, restaurants, and even a movie theater to enjoy during your visit.", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxAdventures.setSpacing(7);
        vboxAdventures.getChildren().addAll(heading, content, space);
        completeTask(btnChinookMall,4);
    }
    @FXML
    private void handleMuseum(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDE82 museum", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Explore one of Calgary’s many museums:", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("- Glenbow Museum: Art and history collide in this expansive museum.", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("- The Military Museums: Learn about Canada's military history.", 12, colorHex, wrappingWidth, alignment, false);
        Text step3 = createText("- TELUS Spark Science Centre: A hands-on science experience for all ages.", 12, colorHex, wrappingWidth, alignment, false);
        Text step4 = createText("- Studio Bell, Home of the National Music Centre: Celebrate Canada's musical history.", 12, colorHex, wrappingWidth, alignment, false);
        Text step5 = createText("- The Calgary Police Museum: Dive into Calgary’s history with law enforcement.", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxAdventures.setSpacing(7);
        vboxAdventures.getChildren().addAll(heading, content, step1, step2, step3, step4, step5, space);
        completeTask(btnMuseum,5);
    }

    @FXML
    private void handleStampede(ActionEvent event) {
        vboxAdventures.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDE82 stampede", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("The Calgary Stampede is an iconic event featuring rodeos, rides, and tons of entertainment. Make sure to check it out in July for a true taste of Western culture and fun.", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxAdventures.setSpacing(7);
        vboxAdventures.getChildren().addAll(heading, content, space);
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
