module com.example.demo7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires org.json;
    requires com.google.gson;

    opens com.example.demo7 to javafx.fxml;
    exports com.example.demo7;
}