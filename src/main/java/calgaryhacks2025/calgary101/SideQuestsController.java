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
import javafx.scene.text.FontWeight;
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
    private void handleTransitPass(ActionEvent event) {

        vboxSQ.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDE82 Ride the Rails, Cowboy!", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Every cowboy knows that sometimes, you gotta ride the city rails instead of your trusty steed. Get yourself a City Transit Pass and save time and money while gettin' around town!", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Step 1: Download the My Fare App", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("Start by downloading the My Fare app. It’s available for iOS and Android. This app lets you easily load your fare, check passes, and ride with ease.", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Step 2: Check Your Fares", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("Depending on your needs, there are different fare types available. Here’s a quick breakdown of what you’ll find on the Calgary Transit website: Adult and Senior fares, Day passes for all-day travel, Monthly passes for regular riders, Youth and student discounts, etc. Take a look at the different passes and decide which one fits your needs! You can check all the details at https://www.calgarytransit.com/fares---passes.html", 12, colorHex, wrappingWidth, alignment, false);
        Text step3 = createText("Step 3: Choose Your Pass", 12, colorHex, wrappingWidth, alignment, true);
        Text content3 = createText("Once you’ve decided on the type of pass, use the My Fare app to load your fare. The app allows you to choose from a list of options", 12, colorHex, wrappingWidth, alignment, false);
        Text step4 = createText("Step 4: Get Riding!", 12, colorHex, wrappingWidth, alignment, true);
        Text content4 = createText("After loading up your fare, hop on the bus or train, and swipe your app to board. Whether you’re headed across the city or just to the next town over, your ride’s just a tap away.", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxSQ.setSpacing(7);
        vboxSQ.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, step4, content4, space);
        completeTask(btnTransitPass,0);

    }

    @FXML
    private void handleLibraryCard(ActionEvent event) {
        vboxSQ.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDCD6 Knowledge Round-Up", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Every cowboy knows that a good library is a goldmine of information. Whether you’re lookin’ for adventure tales, maps to new lands, or a bit of quiet time, a Calgary Public Library Card is your ticket to all that and more!", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Step 1: Head to the Calgary Public Library Website", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("First, make your way over to the Calgary Public Library website (https://www.calgarylibrary.ca/). There, you’ll find the option to “Get a Library Membership”. Just follow the link and fill out the easy registration form online to get started.", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Step 2: Sign Up In-Person (Optional)", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("If you’re more of a hands-on cowboy, you can visit the nearest library branch and sign up for your card in person. The friendly library staff will help you fill out the form, and you’ll have your new card in no time!", 12, colorHex, wrappingWidth, alignment, false);
        Text step3 = createText("Step 3: Start Using Your Card", 12, colorHex, wrappingWidth, alignment, true);
        Text content3 = createText("Once you’ve got your library card, it’s time to explore. You’ll have access to: Books, audiobooks, and e-books, Free programs and events, Digital resources like online courses, streaming, and more!", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxSQ.setSpacing(7);
        vboxSQ.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, space);
        completeTask(btnLibraryCard,1);

    }

    @FXML
    private void handleRewardsCards(ActionEvent event) {
        vboxSQ.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83C\uDF56 Wrangle Your Rewards", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("A good cowboy always knows where to get the best grub, and that means signing up for a Grocery Store Rewards Card! These cards let you save some cash and get great deals on your everyday essentials.", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Step 1: Find A Local Grocery Store", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("Look around for a local store near you that offers a rewards program. Here’s a list of some options: Save-On-Foods, FreshCo, Calgary Co-op, Real Canadian Superstore and more. Some stores even have discounts for students!", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Step 2: Sign Up for Your Card", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("Once you’ve found the store, head on over to their website or in-store to sign up for the rewards card. You’ll typically need: a valid email address and basic personal details like your name and address.", 12, colorHex, wrappingWidth, alignment, false);
        Text ending = createText("Great work, partner! With your Grocery Store Rewards Card in hand, you’ll be ready to load up on supplies without burning a hole in your pocket. Every cowboy needs a good deal!", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxSQ.setSpacing(7);
        vboxSQ.getChildren().addAll(heading, content, step1, content1, step2, content2, ending, space);
        completeTask(btnRewardsCards,2);
    }

    @FXML
    private void handleFairEntry(ActionEvent event) {
        vboxSQ.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDCB0 Lasso Up Discounts", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Sometimes, every cowboy and cowgirl needs a little help to make sure they can take part in all the great things the community has to offer. The Fair Entry Program helps lower-income folks access some of Calgary's finest services at a more affordable rate.", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Step 1: Learn About the Programs", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("The Fair Entry Program provides access to various services at a discounted price, like recreation and cultural programs. Head over to the Fair Entry website to find out which programs and services are available to you. Check it out here: https://www.calgary.ca/social-services/low-income/fair-entry-subsidy.html", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Step 2: Check if You Qualify", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("Wondering if you’re eligible? You’ll want to check out the eligibility requirements to see if you can get access to this subsidy. The website has all the info you need to figure out if you qualify. NOTE: If you do not qualify, you can mark this task 'completed'.", 12, colorHex, wrappingWidth, alignment, false);
        Text step3 = createText("Step 3: Gather Your Documents", 12, colorHex, wrappingWidth, alignment, true);
        Text content3 = createText("When you're ready to apply, you’ll need to gather some acceptable documents. These may include proof of income or residency, depending on the services you're applying for. Take a look at the website to see exactly what’s needed for your application.", 12, colorHex, wrappingWidth, alignment, false);
        Text step4 = createText("Step 4: Apply", 12, colorHex, wrappingWidth, alignment, true);
        Text content4 = createText("There are several ways to submit your Fair Entry application. Whether online, in person, or by mail, you’ll find all the instructions you need to get your application in.", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxSQ.setSpacing(7);
        vboxSQ.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, step4, content4, space);
        completeTask(btnFairEntry,3);
    }
    @FXML
    private void handleUber(ActionEvent event) {
        vboxSQ.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83C\uDFC7 Giddy Up & Go!", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("When you're out on the range, you never know when you’ll need a fast getaway or a quick ride into town. That’s where Uber comes in, partner! It’s like your trusty steed, ready to roll whenever you need it most. NOTE: The steps beyond this line are optional. You may skip these steps and still complete this task in its entirety.", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Step 1: Download the Uber App", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("First, download the Uber app from your phone's app store. Whether you’re on iOS or Android, just find it, hit download, and you’re ready to go.", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Step 2: Sign Up", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("Once the app’s on your phone, open it up and sign up. You’ll need a valid phone number and email address to keep you updated on your rides", 12, colorHex, wrappingWidth, alignment, false);
        Text step3 = createText("Step 3: Set Your Location", 12, colorHex, wrappingWidth, alignment, true);
        Text content3 = createText("After signing up, add your pickup location. This helps Uber know where to find ya, whether you’re stuck on the side of the trail or need a ride to the nearest town.", 12, colorHex, wrappingWidth, alignment, false);
        Text step4 = createText("Step 4: Book a Ride", 12, colorHex, wrappingWidth, alignment, true);
        Text content4 = createText("In case of an emergency, open the app and book your ride. Just set your destination, confirm your ride, and wait for your Uber to arrive. You'll be on your way faster than a cowboy can saddle up!", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxSQ.setSpacing(7);
        vboxSQ.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, step4, content4, space);
        completeTask(btnUber,4);
    }
    @FXML
    private void handleDriversLicense(ActionEvent event) {
        vboxSQ.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDC0E Take the Reins", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Every cowboy needs a trusty steed, but sometimes a vehicle is just as important to get from one ranch to the next. Whether you're rollin' through town or headin' out on a long journey, a driver’s license is your key to freedom!", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Step 1: Learn the Rules of the Road", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("Before you can drive like a cowboy, you’ll need to learn the rules of the road. Head over to the Alberta Driver’s License website (https://www.alberta.ca/get-drivers-licence) to check out all the information on what you need to know, from road signs to traffic laws. You’ll find details on both the GDL (Graduated Driver's License) and Class 5 licenses.", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Step 2: Take the Knowledge Test", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("Once you’re familiar with the rules, it’s time for the knowledge test. This written test covers everything you need to know about driving in Alberta. It’s a good idea to study ahead, so you’re ready to pass!", 12, colorHex, wrappingWidth, alignment, false);
        Text step3 = createText("Step 3: Road Test Time", 12, colorHex, wrappingWidth, alignment, true);
        Text content3 = createText("Once you’ve passed the knowledge test, you’ll need to take the road test. Show off your driving skills to make sure you’re ready for the open road. If you pass, you’ll get your driver’s license!", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxSQ.setSpacing(7);
        vboxSQ.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, space);
        completeTask(btnDriversLicense,5);
    }

    @FXML
    private void handleVolunteer(ActionEvent event) {
        vboxSQ.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83C\uDFDC Save the Town!", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("A true cowboy always looks out for his fellow cowboys and cowgirls. Volunteering is a mighty fine way to give back and make a real difference in your community.", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Step 1: Find a Local Cause", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("There are plenty of ways to volunteer in Calgary—whether it's helping at a food bank, working with local shelters, or supporting community events. Find a cause that speaks to you, and check out what opportunities are available!", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Step 2: Sign Up and Get Involved", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("Once you’ve found something that tugs at your heartstrings, sign up to lend a hand! You’ll be amazed at the impact you can have just by giving your time.", 12, colorHex, wrappingWidth, alignment, false);
        Text ending = createText("Volunteering isn’t just about helping others; it’s also a way to get to know your neighbors, learn new skills, and be part of something bigger than yourself. So saddle up and go find a volunteer opportunity near you!", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vboxSQ.setSpacing(7);
        vboxSQ.getChildren().addAll(heading, content, step1, content1, step2, content2, ending, space);
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
