module com.mt.quizzgameit03v2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.mt.quizzgameit03v2 to javafx.fxml;
    exports com.mt.quizzgameit03v2;
}
