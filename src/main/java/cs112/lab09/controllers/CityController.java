package cs112.lab09.controllers;
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
   //Inject GUI components from FXML file
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

        // Sets the correct data for the view based on the button clicked
        locationLabel.setText(location);  
        dateLabel.setText(event.getEventDay().toString());
        descriptionLabel.setText(event.getDescription());
        revisedDescriptionLabel.setText(event.getRevisedDescription());
        imageView.setImage(event.getImage());

        //open the source material
        hyperlink.setOnAction(e ->{
            
            //Create components for the source view window.
            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();
            Stage stage = new Stage();
            Scene scene = new Scene(webView, 800, 600);

            //load webpage and set stage title
            webEngine.load(event.getCitation());
            stage.setTitle(event.getLocation() + " Riot Citation");
        
            // Set the scene and show the stage
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
