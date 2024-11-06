package io.github.fiecueal.drawerfm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Drawer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(Drawer.class.getResource("files-view.fxml"));
        Scene scene = new Scene(loader.load(), 1280, 720);
        stage.setTitle("Drawer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //TODO allow app to open to any directory by default via config file/command line args
        // State.currentDir(args.initialDir);
        launch();
    }
}
