module com.project.libmansys9may {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.libmansys9may to javafx.fxml;
    exports com.project.libmansys9may;
}