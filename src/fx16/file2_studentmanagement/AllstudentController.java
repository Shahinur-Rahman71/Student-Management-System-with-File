/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx16.file2_studentmanagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Shanto
 */
public class AllstudentController implements Initializable {

    @FXML
    private TableView<Student> studenttableview;
    @FXML
    private TableColumn<Student, String> naemcolumn;
    @FXML
    private TableColumn<Student, String> emailcolumn;
    @FXML
    private TableColumn<Student, String> departmentcolumn;
    @FXML
    private TableColumn<Student, String> addresscolumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        studenttableview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        AddstudentController.tablelist.clear();
        try {
            
            File file=new File("datafile.txt");
            if(!file.exists()) file.createNewFile();
            
            Scanner scan=new Scanner(file);
            while(scan.hasNext()){
                String ami=scan.nextLine();
                String shanto[]=ami.split("#");
                
                Student std=new Student(shanto[0],shanto[1],shanto[2],shanto[3]);
                AddstudentController.tablelist.add(std);
            }
            
            naemcolumn.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
            emailcolumn.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
            departmentcolumn.setCellValueFactory(new PropertyValueFactory<Student, String>("department"));
            addresscolumn.setCellValueFactory(new PropertyValueFactory<Student, String>("address"));
            
            studenttableview.setItems(AddstudentController.tablelist);
        } catch (IOException ex) {
            Logger.getLogger(AllstudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void deleteactionbutton(ActionEvent event) throws IOException {
        
        List<Student> police=studenttableview.getSelectionModel().getSelectedItems();
        AddstudentController.tablelist.removeAll(police);
        
        File file=new File("datafile.txt");
        if(file.exists()) file.createNewFile();
        
        FileWriter fw=new FileWriter(file);
        String str="";
        
        for(Student ami:AddstudentController.tablelist){
            str+=ami.getName()+"#"+ami.getEmail()+"#"+ami.getDepartment()+"#"+ami.getAddress()+"\n";
        }
        
        fw.write(str);
        fw.close();
        
    }
    
}
