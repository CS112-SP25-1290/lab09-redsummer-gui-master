package cs112.lab09;


import cs112.lab09.controllers.MainController;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;



import static cs112.lab09.Constants.*;

public class RedSummer extends Application {
    @Override
    public void start(Stage stage)  throws IOException {
        try{
        FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(MAIN_VIEW_RESOURCE));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle(MAIN_VIEW_TITLE);
        stage.show();
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
    public static void main(String[] args) {
        launch();
    }

    }
    