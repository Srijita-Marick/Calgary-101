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
import javafx.scene.text.FontWeight;
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

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, step4, content4);
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

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().addAll(heading, content, step1, content1, step2, content2, ending);
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

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().addAll(heading, content, step1, content1, step2, content2, step3, content3, step4, content4, step5, content5);
    }

    @FXML
    private void handleSINButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        Text heading = new Text("\uD83D\uDCDD Sheriff’s Records");
        heading.setFont(Font.font("Rockwell", 24));
        heading.setFill(Color.web("#392A20"));

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().add(heading);
    }

    @FXML
    private void handleBankingButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        Text heading = new Text("\uD83D\uDCB0 Stashin’ Your Gold");
        heading.setFont(Font.font("Rockwell", 24));
        heading.setFill(Color.web("#392A20"));

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().add(heading);
    }

    @FXML
    private void handleAlbertaIDButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        Text heading = new Text("\uD83C\uDF32 The Town Registry");
        heading.setFont(Font.font("Rockwell", 24));
        heading.setFill(Color.web("#392A20"));

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().add(heading);
    }

    @FXML
    private void handleEmergencyListButton(ActionEvent event) {
        vBoxEssentials.getChildren().clear();

        Text heading = new Text("\uD83D\uDE91 Frontier Lifeline");
        heading.setFont(Font.font("Rockwell", 24));
        heading.setFill(Color.web("#392A20"));

        vBoxEssentials.setSpacing(7);
        vBoxEssentials.getChildren().add(heading);
    }
}
