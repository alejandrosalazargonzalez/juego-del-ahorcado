
package es.ies.puerto.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import es.ies.puerto.controller.abstractas.AbstractController;
import es.ies.puerto.model.UsuarioEntity;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class ListarUsuariosController extends AbstractController {
    @FXML Button atrasButton;
    @FXML Label usuariosLabel;

    @FXML 
    public void initialize(){
        ArrayList<UsuarioEntity> usuarios = new ArrayList<>();
        try {
            usuarios = new ArrayList<>(getUsuarioServiceModel().obtenerUsarios());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String usuariosStr = "";
        for (UsuarioEntity usuarioEntity : usuarios) {
            usuariosStr += usuarioEntity.toString() + "\n";
        }
        usuariosLabel.setText(usuariosStr);
    }
    @FXML
    public void atrasOnClick(){
        cambiarPantalla(atrasButton,"inicio");
    }
}
