/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import app.MyApp;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ChangeViewController {
     @FXML
    private Button btnSpeichernAction;
    @FXML
    private Button btnLoschenAction;
    @FXML
    private Button btnRuckgangigAction;
    @FXML
    private Button btnBearbeitenAction;
    @FXML
    private TextField suche;
    @FXML
    private Button btnSucheAction;
    @FXML
    private Button btnExitAction;
    @FXML
    private Button btnEinstellungenAction;
    @FXML
    private JFXButton btnStart;
     @FXML
    private JFXButton btnPerson;
   
    @FXML
    private BorderPane borderPane;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private GridPane startPane;
    @FXML
    private JFXButton mitarbeiter;
    
    private void buttonStartView(ActionEvent event) throws Exception {

    }
    public void initialize(URL location, ResourceBundle resources) {
        btnStart.setOnAction(event -> {((Node) event.getSource()).getScene().getWindow();
  
        Parent startParent =null;
            try {
                startParent = FXMLLoader.load(getClass().getResource("/app/StartView.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        Scene startView = new Scene(startParent);
        Stage window = new Stage();

        window.setScene(startView);
        window.setTitle("PersonalentwicklungsManagament");
        window.show();
    });

    }

}
