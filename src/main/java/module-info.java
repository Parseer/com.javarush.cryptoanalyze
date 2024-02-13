module com.javarush.cryptoanalyzer.dolgov.uidemofinalm1dolgov {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.javarush.cryptoanalyzer.dolgov.uidemofinalm1dolgov to javafx.fxml;
    exports com.javarush.cryptoanalyzer.dolgov.uidemofinalm1dolgov;
    exports controller;
    opens controller to javafx.fxml;
    exports;
    opens to
}