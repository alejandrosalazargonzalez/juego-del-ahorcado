
package es.ies.puerto.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import es.ies.puerto.controller.abstractas.AbstractController;
import es.ies.puerto.model.UsuarioEntity;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class ListarUsuariosController extends AbstractController {
    @FXML Button atrasButton;
    @FXML ListView listViewUsuarios;

    @FXML
    public void initialize(){
        ArrayList<UsuarioEntity> usuarios = new ArrayList<>();
        try {
            usuarios = new ArrayList<>(getUsuarioServiceModel().obtenerUsarios());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        listViewUsuarios.getItems().addAll(usuarios);
    }
    @FXML
    public void atrasOnClick(){
        cambiarPantalla(atrasButton,"inicio");
    }
}
