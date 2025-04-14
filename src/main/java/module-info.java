module com.example.digikala {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.digikala to javafx.fxml;
    exports com.example.digikala;
}