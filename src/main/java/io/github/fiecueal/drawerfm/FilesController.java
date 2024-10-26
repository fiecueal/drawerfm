package io.github.fiecueal.drawerfm;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.File;

public class FilesController {

    @FXML
    public ListView<Label> files;

    public void fillFileList(String dirName) {
        for (final File file : new File(dirName).listFiles()) {
            Label f = new Label();
            f.setText(file.getName());
            files.getItems().add(f);
        }
    }
}