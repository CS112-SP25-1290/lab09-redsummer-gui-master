package cs112.lab09.controllers;
import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class CityController {
    @FXML
    private Label locationLabel = new Label();
    @FXML
    private Label dateLabel = new Label();
    @FXML
    private Label descriptionLabel = new Label();
    @FXML
    private Label revisedDescriptionLabel = new Label();
    @FXML
    private Button closeButton = new Button();
    @FXML
    private ImageView imageView = new ImageView();
    @FXML
    private Hyperlink hyperlink = new Hyperlink();

    public void initialize() {
        closeButton.setOnAction(e -> handleCloseButton(e));   
    }
    // Initialize the data for the city view
    public void initData(String location, RevisedHistoricalEvent event) {

        locationLabel.setText(location);  
        dateLabel.setText(event.getEventDay().toString());
        descriptionLabel.setText(event.getDescription());
        revisedDescriptionLabel.setText(event.getRevisedDescription());
        imageView.setImage(event.getImage());

        //open the source material
        hyperlink.setOnAction(e ->{
            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();

            webEngine.load(Constants.HISTORICAL_DATA[1][5]);

            // Create a new stage for the WebView
            Stage stage = new Stage();
            Scene scene = new Scene(webView, 800, 600);
            stage.setTitle("San Francisco Riot Citation");
            stage.setScene(scene);
            stage.show();  
        });
    }
    //close popup window
    public void handleCloseButton(ActionEvent e){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
