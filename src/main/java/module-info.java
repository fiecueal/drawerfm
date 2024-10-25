module io.github.fiecueal.drawerfm {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.fiecueal.drawerfm to javafx.fxml;
    exports io.github.fiecueal.drawerfm;
}