module com.example.javalessonone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javalessonone to javafx.fxml;
    exports com.example.javalessonone;
}