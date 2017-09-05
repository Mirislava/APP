/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package until;

import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author pjm
 */
public class ViewChangerUtil {
    public static void setView(String fxml, BorderPane center) {
        Runnable topHeader = () -> {
            	try{
                    //String menuCSS = getClass().getResource("/com/pentarex/fhfx/reborn/resources/css/menu.css").toExternalForm();
                    FXMLLoader fxmlTopLoader = new FXMLLoader();
                    //fxmlTopLoader.setResources(ResourceBundle.getBundle("com.pentarex.fhfx.reborn.i18n.FH", rb.getLocale()));
                    //T pane = (T) fxmlTopLoader.load(ViewChangerUtil.class.getResource("/com/pentarex/fhfx/reborn/resources/templates/Header.fxml").openStream());
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
