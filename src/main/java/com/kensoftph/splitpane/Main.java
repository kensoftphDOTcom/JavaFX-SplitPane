package com.kensoftph.splitpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("splitpane.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Understanding the SplitPane");
        stage.setScene(scene);
        stage.show();*/

        SplitPane splitPane = new SplitPane();
        //splitPane.setDividerPosition(0,0.8);
        //splitPane.setOrientation(Orientation.VERTICAL);
        TextArea txtArea1 = new TextArea();
        TextArea txtArea2 = new TextArea();
        txtArea1.setWrapText(true);
        splitPane.getItems().addAll(txtArea1, txtArea2);

        Scene scene = new Scene(splitPane, 500, 400);
        stage.setScene(scene);
        stage.setTitle("Undertanding the SplitPane");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}