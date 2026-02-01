package com.example.miniwebbrowserjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import  javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TextField UrlField = new TextField();
        WebView browser = new WebView();
        WebEngine engine = browser.getEngine();

        // Load a web page when the user press 'enter'
        UrlField.setOnAction(event -> engine.load( UrlFormatter(UrlField.getText()) ) );

        VBox vbox = new VBox();
        vbox.getChildren().addAll(UrlField, browser);
        Scene scene = new Scene(vbox);

        stage.setTitle("My Java Browser");
        stage.setScene(scene);
        stage.show();
    }

    public String UrlFormatter (String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        return url;
    }

    public static void main(String[] args) {
        launch();
    }
}