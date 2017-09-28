
package Controller;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * 
 *
 * @author Mirislava Turbic
 */
public class LoginController implements Initializable{
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label Msg;
    @FXML
    private Button anmelden;

    private void buttonLoginAction(ActionEvent event) throws Exception {
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        anmelden.setOnAction(event -> {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            if(username.getText().equals("mimi") && password.getText().equals("1234")){

                Parent parent = null;
                try {
                    parent = FXMLLoader.load(getClass().getResource("/app/Layout.fxml"));
                    Stage stage=new Stage();
                    Scene scene=new Scene(parent);
                    stage.setScene(scene);
                    stage.setTitle("Layout");
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else Msg.setText("Benutzername oder Kennword ist falsch! Bitte noch einmal eingeben! ");
        });
    }
}
