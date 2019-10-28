
package fx16.file2_studentmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Fx16File2_studentManagement extends Application{

    
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        Parent pane=FXMLLoader.load(getClass().getResource("First.fxml"));
        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        //primaryStage.setMaximized(true);//true for full screen;
    }
    
}
