/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx16.file2_studentmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class FirstController implements Initializable {

    @FXML
    VBox Maincontain;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            Parent pane=FXMLLoader.load(getClass().getResource("Welcome.fxml"));
            Maincontain.getChildren().setAll(pane);
        } catch (IOException ex) {
            Logger.getLogger(FirstController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void Addstudentbutton(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("Addstudent.fxml"));
        Maincontain.getChildren().setAll(pane);
        
    }

    @FXML
    private void Allstudentbutton(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("Allstudent.fxml"));
        Maincontain.getChildren().setAll(pane); 
        
    }

    @FXML
    private void Homepagebutton(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        Maincontain.getChildren().setAll(pane);
        
    }
    
}
