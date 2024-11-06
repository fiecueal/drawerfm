package io.github.fiecueal.drawerfm;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.File;

public class FilesController {
    @FXML // the file names displayed in the UI
    private ListView<String> fileNamesView;
    // reactive list of files that fileNamesView attaches to
    private ObservableList<String> fileNamesList;

    public void initialize() {
        fileNamesList = FXCollections.observableArrayList();
        fileNamesView.setItems(fileNamesList);

        if (State.currentDir() != null) {
            // this shouldn't throw an error because of how currentDir is handled
            for (File file : new File(State.currentDir()).listFiles()) {
                fileNamesList.add(file.getName());
            }
        }
    }
}
