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

public class EssentialsController {

    @FXML
    private VBox vBoxEssentials;
    @FXML
    private Button btnPhoneNumber;
    @FXML
    private Button btnResidence;
    @FXML
    private Button btnHealthCard;
    @FXML
    private Button btnSIN;
    @FXML
    private Button btnBanking;
    @FXML
    private Button btnAlbertaID;
    @FXML
    private Button btnEmergencyList;
    private Color colour;
    private String[] logText=new String[4];


    @FXML
    private void initialize() throws FileNotFoundException {
        Button[] buttons = new Button[7];
        buttons[0] = btnPhoneNumber;
        buttons[1] = btnResidence;
        buttons[2] = btnHealthCard;
        buttons[3] = btnSIN;
        buttons[4] = btnBanking;
        buttons[5] = btnAlbertaID;
        buttons[6] = btnEmergencyList;


        try {
            File log = new File("src/main/java/calgaryhacks2025/calgary101/log");
            Scanner myReader = new Scanner(log);
            int count=0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                logText[count] = data;
                count++;
                if(data.contains("essentials")){
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
    private void handlePhnButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("☎ Gettin’ Your Ranch Line", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Well, partner, before you can start wranglin' up calls and messages from all your fellow cowboys and cowgirls, ya gotta get your hands on a Canadian SIM card. It’s just like buyin' a new saddle—you need it to stay in the game.", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Step 1: Pick Your Provider", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("First, you’ll need to choose which cell provider you're gonna ride with. Canada’s got some big ol' names like Rogers, Telus, and Bell. These folks are reliable, just like a trusty steed. Find one that suits your needs for coverage, data, and cost.", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Step 2: Get That SIM Card", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("Once you’ve decided, head to the nearest store or grab a SIM card online. If you’re more of a digital cowboy, you can usually get the SIM delivered straight to your door—no need to saddle up and leave your camp.", 12, colorHex, wrappingWidth, alignment, false);
        Text step3 = createText("Step 3: Activation & Registration", 12, colorHex, wrappingWidth, alignment, true);
        Text content3 = createText("Time to get that SIM card activated! Whether you’re settin' it up in the store or doin' it yourself online, you’ll need to provide a valid ID (just like you’d show a sheriff if asked). This could be your passport, driver’s license, or another government-issued ID." + "After that, you’ll choose a plan. Do you need a big ol' data plan to stream the latest Westerns? Or are you just lookin' to make a few calls now and then? Pick what works best for your ride across this wild land.", 12, colorHex, wrappingWidth, alignment, false);
        Text step4 = createText("Step 4: Test Your Connection", 12, colorHex, wrappingWidth, alignment, true);
        Text content4 = createText("Once that SIM is in your phone, give it a test! Make sure you can call your posse or get on the web for some quick info. If it don’t work, don’t fret—just visit your local store or call up customer support to get things sorted out.", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, step4, content4, space);
        completeTask(btnPhoneNumber,0);
    }

    @FXML
    private void handleResButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83C\uDFE1 Secure Your Homestead", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Before you can settle in and start living the cowboy life, you gotta show folks where your home is. In the modern world, this means proving your residence—just like a homesteader needs a deed to claim their land.", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("If You’re a Student Living in Residence:", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("Head on up to the authorities (usually your campus housing office) and ask for a proof of residence document. They’ll provide one for ya, just like a homestead deed.", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("If You’re Living in a House or Rental:", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("Grab your rental agreement or house deed—anything that shows you’re the rightful owner or renter of the place. Utility bills or bank statements with your address can work too.", 12, colorHex, wrappingWidth, alignment, false);
        Text ending = createText("With that, you’ve got your Homestead secured, and you’re one step closer to settlin' down for good!", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().addAll(heading, content, step1, content1, step2, content2, ending, space);
        completeTask(btnResidence,1);
    }

    @FXML
    private void handleHealthCButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("⛨ Cowboy’s Insurance", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("In the wild west, every cowboy needs a good insurance policy—and no, we ain't talkin’ about your saddle or gear. We’re talkin’ about health coverage to keep you in tip-top shape while you ride through life. In Alberta, that’s your Alberta Health Card.", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Step 1: Check Your Eligibility", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("Before applying, make sure you’re eligible for coverage. Visit the Alberta Health Care Insurance Plan (AHCIP) eligibility page (https://www.alberta.ca/ahcip-how-to-apply) to see if you qualify.", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Step 2: Complete the Application Form", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("Fill out the AHCIP Application Form. If you're a Canadian child of non-eligible parents, use the specific form for that situation. Find all forms on the Alberta Health website.", 12, colorHex, wrappingWidth, alignment, false);
        Text step3 = createText("Step 3: Gather Your Info", 12, colorHex, wrappingWidth, alignment, true);
        Text content3 = createText("Make sure you have the following documents ready: a valid ID, proof of Alberta residency, and legal entitlement to be in and remain in Canada.", 12, colorHex, wrappingWidth, alignment, false);
        Text step4 = createText("Step 4: Submit Your Application", 12, colorHex, wrappingWidth, alignment, true);
        Text content4 = createText("You can apply online or in person. Head to an Alberta Health Services office, or simply apply through their website. If you’re applying in person, they’ll take your details and have you fill out a quick form.", 12, colorHex, wrappingWidth, alignment, false);
        Text step5 = createText("Step 5: Wait for Your Card", 12, colorHex, wrappingWidth, alignment, true);
        Text content5 = createText("Once approved, your Alberta Health Card will be mailed to you. Keep it safe, just like your trusty lasso! You'll need it whenever you visit a doctor or need medical attention.", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, step4, content4, step5, content5, space);
        completeTask(btnHealthCard,2);
    }

    @FXML
    private void handleSINButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDCDD Sheriff’s Records", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("In Canada, every cowboy needs to register themselves with the government—and that’s where the Social Insurance Number (SIN) comes into play. It's your ticket to accessing government services, earning income, and contributing to taxes.", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Who Needs a SIN?", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("A SIN is a must for anyone working or studying in Canada. If you're working, paying taxes, or wanting to access government services, you need one. It’s like your branding iron—it lets the government know who you are. To know more about eligibility and the steps to acquiring a SIN, head over to https://www.canada.ca/en/employment-social-development/services/sin/qualify.html#wb-cont", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Apply for Your SIN", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("You can apply for your SIN online through the official SIN website, which is the fastest method. Alternatively, you can apply by mail by printing out the form and sending it with your ID documents. If you prefer in-person service, visit a Service Canada Centre and apply directly.", 12, colorHex, wrappingWidth, alignment, false);
        Text step3 = createText("Wait for Your SIN", 12, colorHex, wrappingWidth, alignment, true);
        Text content3 = createText("Once you've applied, your SIN card will be mailed to you. If you applied online, the wait is usually shorter. Keep an eye on your mailbox, and your SIN will arrive soon!", 12, colorHex, wrappingWidth, alignment, false);
       Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, space);
        completeTask(btnSIN,3);
    }

    @FXML
    private void handleBankingButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDCB0 Stashin’ Your Gold", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Every cowboy needs a secure way to store their hard-earned gold, and that’s where a Canadian bank account comes in. Whether you’re looking for a credit card to handle purchases or a debit card for quick access to your funds, getting set up with a Canadian bank is essential.", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Choose Your Bank", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("Canada has plenty of banks to choose from, so take your pick! Some of the big names in banking include: Royal Bank of Canada (RBC), TD Bank, Scotiabank, CIBC and BMO (Bank of Montreal). Pick the one that suits your needs and head on over to their website to get started.", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Gather Your Documents", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("To set up your bank account, you’ll need to gather a few important documents such as a valid ID, proof of address, and your SIN. Make sure you have these ready so the process goes smooth!", 12, colorHex, wrappingWidth, alignment, false);
        Text step3 = createText("Apply for a Bank Account", 12, colorHex, wrappingWidth, alignment, true);
        Text content3 = createText("Once you’ve chosen a bank and gathered your documents, you can apply for your debit or credit card. You can usually apply online or in person at your chosen bank.", 12, colorHex, wrappingWidth, alignment, false);
        Text step4 = createText("Wait for Your Card", 12, colorHex, wrappingWidth, alignment, true);
        Text content4 = createText("After your application is processed, your debit or credit card will be sent to you in the mail. Make sure your mailing address is correct and up-to-date so you don’t miss it!", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, step4, content4, space);
        completeTask(btnBanking,4);
    }

    @FXML
    private void handleAlbertaIDButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83C\uDF32 The Town Registry", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Every cowboy needs their Alberta ID, a trusty card that proves you’re part of the herd. Whether you’re out on the trail or in town, it’s important to have your official identification ready. Let’s get you set up!", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Check Your Eligibility", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("Before you hit the trail, make sure you're eligible to apply for an Alberta ID. Head on over to the Alberta ID website (https://www.alberta.ca/get-id-card) to find out if you can get one.", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Gather Your Documents", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("Once you’ve confirmed you’re eligible, gather the documents you’ll need to apply for your Alberta ID. You may need proof of residency or citizenship, so make sure you have everything ready.", 12, colorHex, wrappingWidth, alignment, false);
        Text step3 = createText("Apply for Your Alberta ID", 12, colorHex, wrappingWidth, alignment, true);
        Text content3 = createText("With your documents in hand, it’s time to apply. You can apply for your Alberta ID online or in person at a registry office. Find all the details about how to submit your application on the website.", 12, colorHex, wrappingWidth, alignment, false);
        Text step4 = createText("Wait for Your ID", 12, colorHex, wrappingWidth, alignment, true);
        Text content4 = createText("Once you’ve applied, your shiny new Alberta ID will be mailed to you. Make sure your mailing address is up-to-date so you get it without a hitch!", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, step4, content4, space);
        completeTask(btnAlbertaID,5);
    }

    @FXML
    private void handleEmergencyListButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        double wrappingWidth = 350;
        String colorHex = "#392A20";
        TextAlignment alignment = TextAlignment.JUSTIFY;

        Text heading = createText("\uD83D\uDE91 Frontier Lifeline", 24, colorHex, wrappingWidth, alignment, true);
        Text content = createText("Every cowboy knows that being prepared is half the battle, especially when it comes to emergencies. Whether you’re in need of help on the trail or stuck in a jam, it’s important to know who to call and when. So saddle up and get informed!", 12, colorHex, wrappingWidth, alignment, false);
        Text step1 = createText("Step 1: Head Back to the Homepage", 12, colorHex, wrappingWidth, alignment, true);
        Text content1 = createText("Your first stop is the homepage. From there, take a look at the emergency numbers section. This will give you all the key contacts you need in case of a real emergency.", 12, colorHex, wrappingWidth, alignment, false);
        Text step2 = createText("Step 2: Know Who to Call", 12, colorHex, wrappingWidth, alignment, true);
        Text content2 = createText("The website lists important numbers for things like the police, the fire department, immediate medical assistance and emergency hotlines. These are the folks you'll need if trouble comes knocking.", 12, colorHex, wrappingWidth, alignment, false);
        Text ending = createText("Make sure you keep your emergency list close at hand and stay informed. You never know when you might need one of these numbers to help you out of a tough spot!", 12, colorHex, wrappingWidth, alignment, false);
        Text space = createText(" ", 12, colorHex, wrappingWidth, alignment, false);

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().addAll(heading, content, step1, content1, step2, content2, ending, space);
        completeTask(btnEmergencyList,6);
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
                    logText[0] = logText[0].substring(0,11+i) + '1'+logText[0].substring(12+i);
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
            vBoxEssentials.getChildren().add(btnComplete);
        }

    }
}
