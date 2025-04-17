package cs112.lab09.controllers;
import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import static cs112.lab09.Constants.*;

public class MainController {
    @FXML 
    private Label titleLabel = new Label();
    @FXML
    private Label subtitleLabel = new Label();
    @FXML
    private Label mainDescription = new Label();
    @FXML
    private Button startButton = new Button();
    @FXML
    private Button exitButton = new Button();
     
    public void initialize() {
        titleLabel.setText(MAIN_TITLE);
        subtitleLabel.setText(MAIN_SUBTITLE);
        mainDescription.setText(MAIN_DESCRIPTION);

        startButton.setOnAction(e -> handleStartButton(e));
        exitButton.setOnAction(e -> handleExitButton(e));
        
    }
    public void handleStartButton(ActionEvent e){
        try {

            //Load the FXML file for the map view
            //Uses current stage to set the scene
            FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(MAP_VIEW_RESOURCE));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) startButton.getScene().getWindow();
            // Set the scene and title for the stage
            stage.setScene(scene);
            stage.setTitle(MAP_VIEW_TITLE);
            // Close Main View and open Map View
            stage.show();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void handleExitButton(ActionEvent e){
        //Closes the stage
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
        
}

