package com.example.brickbreaker;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {  //The entry point for JavaFX applications is the Application class. The JavaFX runtime does the following, in order, whenever an application is launched: Constructs an instance of the specified Application class. Calls the init() method. Calls the start(javafx.stage.Stage) method

    static Stage globalstage;   //A JavaFX Stage, javafx. stage. Stage , represents a window in a JavaFX desktop application.
       // Inside a JavaFX Stage you can insert a JavaFX Scene which represents the content displayed inside a window - inside a Stage


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("startpage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        globalstage = stage;
        stage.setTitle("Welcome to Start Page");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void Onstartbuttonclick() throws IOException{      //on click of let's begin button
        //we have to open the game screen here
        //globalstage.setTitle("button clicked");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gamescreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        globalstage.setScene(scene);
        globalstage.setTitle("Welcome to game screen");
        globalstage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}
//In JavaFX id is used to set a CSS ID to a component.
// And fx:id is used for accessing that component in code (i.e. in a controller class). fx:id works like a components name