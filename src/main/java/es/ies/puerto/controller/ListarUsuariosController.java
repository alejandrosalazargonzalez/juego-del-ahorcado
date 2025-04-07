
package es.ies.puerto.controller;

import es.ies.puerto.controller.abstractas.AbstractController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class ListarUsuariosController extends AbstractController {
    @FXML Button atrasButton;

    @FXML
    public void atrasOnClick(){
        cambiarPantalla(atrasButton,"inicio");
    }
}
