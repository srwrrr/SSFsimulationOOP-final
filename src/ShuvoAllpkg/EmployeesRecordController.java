/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ShuvoAllpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Shuvo
 */
public class EmployeesRecordController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("HrMannegerDashboard.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void ExitButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("/ssfsimulationoop/Loginscene.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }
    
}
