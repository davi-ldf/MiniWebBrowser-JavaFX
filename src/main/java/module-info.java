module com.example.miniwebbrowserjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;     // ESSENCIAL para WebEngine


    requires org.controlsfx.controls;

    opens com.example.miniwebbrowserjavafx to javafx.fxml;
    exports com.example.miniwebbrowserjavafx;
}