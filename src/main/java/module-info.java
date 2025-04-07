module es.alejandrosalazargonzalez.ahorcado {
    requires javafx.controls;
    requires javafx.fxml;

    requires transitive org.controlsfx.controls;
    requires javafx.graphics;
    requires transitive java.sql;
    

    opens es.alejandrosalazargonzalez.ahorcado to javafx.fxml;
    exports es.alejandrosalazargonzalez.ahorcado;
    exports es.alejandrosalazargonzalez.ahorcado.controller;
    exports es.alejandrosalazargonzalez.ahorcado.controller.abstractas;
    exports es.alejandrosalazargonzalez.ahorcado.model;
    exports es.alejandrosalazargonzalez.ahorcado.model.abstractas;
    opens es.alejandrosalazargonzalez.ahorcado.controller to javafx.fxml;
}