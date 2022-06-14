module com.patho.check_jen_nex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.patho.check_jen_nex to javafx.fxml;
    exports com.patho.check_jen_nex;
}