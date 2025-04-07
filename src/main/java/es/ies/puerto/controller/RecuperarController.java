
package es.ies.puerto.controller;

import java.io.IOException;

import es.ies.puerto.PrincipalApplication;
import es.ies.puerto.controller.abstractas.AbstractController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class RecuperarController extends AbstractController {

    @FXML private Button regresarButton;

    /**
     * Cambia a la pantalla de log in
     */
    @FXML
    public void recuperarToLoginOnClick(){
        cambiarPantalla(regresarButton,"app-init");
    }
}