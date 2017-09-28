/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Mirislava Turbic
 */
public class MyApp extends Application {
    
    private Stage primaryStage;
    private AnchorPane rootLayout;
   

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        rootLayout = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image(MyApp.class.getResourceAsStream("/app/ranorex-logo.png")));
        primaryStage.show();

        stage.setTitle("Ranorex");
        //stage.getIcons().add(new Image(MyApp.class.getResourceAsStream("/app/ranorex-logo.png")));
      
        stage.setScene(scene);
        stage.show();
    }

  
    public static void main(String[] args) {
        launch(args);
    }
    
}
