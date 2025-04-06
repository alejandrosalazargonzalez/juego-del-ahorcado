
package es.ies.puerto.controller;

import java.io.IOException;

import es.ies.puerto.PrincipalApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *   @author: alejandrosalazargonzalez
 *   @version: 1.0.0
 */
public class InicioController extends LoginController{
    
    @FXML private Button editarButton;
    @FXML private Button jugarButton;
    @FXML private Button regresarButton;

    /**
     * va a la pantalla registrar
     */
    @FXML
    public void inicioToRegistrarOnClick(){
        setRegresar(false);
        try {
            Stage stage = (Stage)regresarButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("registrar.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350, 500);
            stage.setTitle("pagina registro");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * va a la pantalla de partida
     */
    @FXML
    public void inicioToPartidaOnClick(){
        try {
            Stage stage = (Stage)regresarButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("juego.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350, 500);
            stage.setTitle("pagina registro");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * va a la pantalla de login
     */
    @FXML
    public void inicioToLoginOnClick(){
        try {
            Stage stage = (Stage)regresarButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("app-init.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350, 500);
            stage.setTitle("pagina registro");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
