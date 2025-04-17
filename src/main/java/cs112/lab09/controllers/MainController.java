package cs112.lab09.controllers;

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
            FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource("map-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) startButton.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle(MAP_VIEW_TITLE);
            stage.show();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void handleExitButton(ActionEvent e){
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
        
}

