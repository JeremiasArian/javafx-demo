module test.javafx.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens test.javafx.javafxdemo to javafx.fxml;
    exports test.javafx.javafxdemo;
}