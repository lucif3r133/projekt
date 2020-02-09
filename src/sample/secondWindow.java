package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class secondWindow implements Initializable {


    @FXML
    Button secondWindowClose;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void exitSecondWindow()
    {
        Platform.exit();
        MainController.exit();
    }





}
