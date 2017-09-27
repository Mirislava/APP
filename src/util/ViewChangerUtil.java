/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class ViewChangerUtil {
     @FXML
    private BorderPane borderPane;
    public static void setView(String fxml, BorderPane center) {
        Runnable topHeader = () -> {
            	try{
                  
                    FXMLLoader fxmlTopLoader = new FXMLLoader();
                    
                    Pane pane = (Pane) fxmlTopLoader.load(ViewChangerUtil.class.getResource(fxml).openStream());
                    //GridPane.setRowIndex(headerPane, 0);
                    //GridPane.setRowIndex(menuPane, 1);
                    //menuPane.getStylesheets().add(menuCSS);
                    //layoutTop.getChildren().addAll(headerPane, menuPane);
                    center.getChildren().add(pane);
            	} catch(Exception e){
            		//TODO log4j
            		e.printStackTrace();
            	}
            };
            Platform.runLater(topHeader);
    }
}
