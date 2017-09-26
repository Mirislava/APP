/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import until.ViewChangerUtil;

/**
 *
 * @author Mirislava Turbic
 */
public class LayoutController implements Initializable {
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
    private BorderPane centerPane;



    public void setBtnSpeichernAction(Button btnSpeichernAction) {
        this.btnSpeichernAction = btnSpeichernAction;
    }
  

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnStart.setOnAction(value -> {
            changeCenter("/app/StartView.fxml");
        });
         btnPerson.setOnAction(value -> {
            changeCenter("/app/Mitarbeiter_Startseite.fxml");
        });
    }

    public void changeCenter(String fxml){
        ViewChangerUtil.setView(fxml, centerPane);
    }
    
    
}
