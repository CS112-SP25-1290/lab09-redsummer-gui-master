package cs112.lab09.controllers;
import cs112.lab09.RedSummer;
import cs112.lab09.models.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import static cs112.lab09.Constants.*;

public class MapController {
    @FXML
    private Button cityStateButton1 = new Button();
    @FXML
    private Button cityStateButton2 = new Button();

    public void initialize() {
        //Set button text
        cityStateButton1.setText("Brisbee,\nArizona");
        cityStateButton2.setText("San Francisco,\nCalifornia");

        //Set button action
        cityStateButton1.setOnAction(e -> handleCityButton(e));
        cityStateButton2.setOnAction(e -> handleCityButton(e));
    }

    //Creates the new window. Initializes the data based on button clicked.
    //The data is passed into CityController's initData method to set values in the new window.
    public void handleCityButton(ActionEvent e){
        try {
                //Load the FXML file for the city view
                FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(CITY_VIEW_RESOURCE));
                // Create a new stage for the city view
                // Set the scene with the loaded FXML
                Stage stage = new Stage();
                Scene scene = new Scene(fxmlLoader.load());
                // Set the scene and title for the stage. Configure modality.
                stage.setScene(scene);
                stage.setTitle(CITY_VIEW_TITLE);
                stage.initModality(Modality.APPLICATION_MODAL); 
                // Get the controller from the FXMLLoader
                CityController cityController = fxmlLoader.getController();
                // Set the appropriate city data based on the button clicked
                if (e.getSource() == cityStateButton2) {
                    cityController.initData(HISTORICAL_DATA[0][1], new RevisedHistoricalEvent(HISTORICAL_DATA[0][0], HISTORICAL_DATA[0][1], HISTORICAL_DATA[0][2], new Date(HISTORICAL_DATA[0][3]), HISTORICAL_DATA[0][4] , HISTORICAL_DATA[0][5]));  
                } else if (e.getSource() == cityStateButton1) {
                    cityController.initData(HISTORICAL_DATA[1][1], new RevisedHistoricalEvent(HISTORICAL_DATA[1][0], HISTORICAL_DATA[1][1], HISTORICAL_DATA[1][2], new Date(HISTORICAL_DATA[1][3]), HISTORICAL_DATA[1][4], HISTORICAL_DATA[1][5])); 
                }
                //Show popup and prevent input on other windows until closed
               stage.show();

            }catch(IOException ex) {
                System.out.println(ex.getMessage());
        }
    }
}

        
    


        


