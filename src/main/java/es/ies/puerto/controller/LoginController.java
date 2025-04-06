
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
public class LoginController {

    @FXML private Button aceptarButton;
    @FXML private Button registrarButton;
    @FXML private Button recuperarButton;

    public boolean regresar;

    /**
     * cambia el valor de regresar
     * @param regresar
     */
    public void setRegresar(boolean regresar) {
        this.regresar = regresar;
    }
    public boolean getRegresar(){
        return regresar;
    }
    /**
     * cambia a la pantalla de inicio
     */
    @FXML
    public void loginAceptarOnClick() {
        try {
            Stage stage = (Stage)aceptarButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("inicio.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350, 500);
            stage.setTitle("pagina inicio");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * cambia a la pantalla de registrar
     */
    @FXML
    protected void loginToRegistrarOnClick() {
        setRegresar(true);
        try {
            Stage stage = (Stage)aceptarButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("registrar.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350, 500);
            stage.setTitle("pagina registrar");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * cambia a la pantalla de recuperar
     */
    @FXML
    protected void loginToRecuperarOnClick() {
        try {
            Stage stage = (Stage)aceptarButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("recuperar.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350, 500);
            stage.setTitle("pagina recuperar");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}