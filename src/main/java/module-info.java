module com.ydnakif.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ydnakif.hellofx to javafx.fxml;
    exports com.ydnakif.hellofx;
}