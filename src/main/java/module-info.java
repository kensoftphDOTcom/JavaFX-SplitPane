module com.kensoftph.splitpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.splitpane to javafx.fxml;
    exports com.kensoftph.splitpane;
}