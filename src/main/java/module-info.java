module com.example.bibli {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bibli to javafx.fxml;
    exports com.example.bibli;
}