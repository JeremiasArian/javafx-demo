package test.javafx.javafxdemo;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    protected void onExitButtonClick() {
        Platform.exit();
    }
}