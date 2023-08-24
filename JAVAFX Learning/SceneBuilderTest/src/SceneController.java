import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneController {

    @FXML
    private Label infoLabel;
    
    @FXML
    private TextField infoUser;

    @FXML
    private Button searchButton;

    @FXML
    private Button returnButton;
    
    private static String info;
    
    @FXML
    void switchInfo() throws IOException{
        Parent root = FXMLLoader.load((getClass().getResource("scene2.fxml")));
        Stage window = (Stage)searchButton.getScene().getWindow();
        window.setScene(new Scene(root)); 
    }
    
    @FXML
    void returnScene() throws IOException {
        Parent root = FXMLLoader.load((getClass().getResource("mainLayout.fxml")));
        Stage window = (Stage)returnButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }


}
