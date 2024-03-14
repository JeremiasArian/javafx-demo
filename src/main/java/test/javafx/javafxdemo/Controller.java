package test.javafx.javafxdemo;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class Controller {

    @FXML
    protected void onExitButtonClick() {
        Platform.exit();
    }
}