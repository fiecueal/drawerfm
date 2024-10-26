package io.github.fiecueal.drawerfm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Drawer extends Application {
    public static final String HOME_DIR = System.getProperty("user.home");

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(Drawer.class.getResource("files-view.fxml"));
        Scene scene = new Scene(loader.load(), 1280, 720);
        stage.setTitle("Drawer");
        stage.setScene(scene);
        stage.show();

        FilesController fc = loader.getController();
        fc.fillFileList(HOME_DIR);
    }

    public static void main(String[] args) {
        launch();
    }
}
