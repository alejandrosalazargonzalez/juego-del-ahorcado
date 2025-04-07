package es.alejandrosalazargonzalez.ahorcado.controller;

import es.alejandrosalazargonzalez.ahorcado.controller.abstractas.AbstractController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class JuegoController extends AbstractController {
    
    @FXML Button regresarButton;
    @FXML private Button reiniciarButton;

    @FXML
    public void reiniciarOnClick(){
        
    }
    /**
     * va a la pantalla de inicio
     */
    @FXML
    public void juegoToInicioOnClick(){
        cambiarPantalla(regresarButton,"inicio");
    }
}
