
package fx16.file2_studentmanagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class AddstudentController implements Initializable {

    @FXML
    private TextField namefield;
    @FXML
    private TextField emailfield;
    @FXML
    private TextField deptfield;
    @FXML
    private TextArea addressfield;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
   static ObservableList<Student> tablelist=FXCollections.observableArrayList();
    @FXML
    private void AddbuttonAction(ActionEvent event) throws IOException {
        
       String name= namefield.getText();
       String email= emailfield.getText();
       String dept= deptfield.getText();
       String address= addressfield.getText();
       
       if(name.equals("")||email.equals("")||dept.equals("")||address.equals("")) return;
        
        File file=new File("datafile.txt");
        if(!file.exists()) file.createNewFile();
        FileWriter fw=new FileWriter(file,true);
        fw.write(name+"#"+email+"#"+dept+"#"+address+"\n");
        fw.close();
        
        namefield.clear();
        emailfield.clear();
        deptfield.clear();
        addressfield.clear();
        


      
        
        
    }

    @FXML
    private void ResetbuttonAction(ActionEvent event) {
        namefield.clear();
        emailfield.clear();
        deptfield.clear();
        addressfield.clear();
    }
    
}
