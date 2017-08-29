/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author pjm
 */
public class LayoutController implements Initializable {
    @FXML
    private void btnPersonAction(ActionEvent event) throws Exception{
        ((Node)(event.getSource())).getScene().getWindow().hide();

        Parent parent = FXMLLoader.load(getClass().getResource("/PersonEditDialog.fxml"));
        Stage stage=new Stage();
        Scene scene=new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("Mitarbeiter");
        stage.show();

    }
     @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    
}
