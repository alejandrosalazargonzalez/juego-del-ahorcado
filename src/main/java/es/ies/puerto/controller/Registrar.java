
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
public class Registrar extends LoginController{
    
    @FXML private Button regresarButton;
    
    /**
     * dependiendo del valor de regresar va a una pantalla o a otra
     */
    @FXML
    public void regresarOnClick(){
        if (getRegresar()) {
        try {
            Stage stage = (Stage)regresarButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("app-init.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350, 500);
            stage.setTitle("pagina Login");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }else{
            try {
                Stage stage = (Stage)regresarButton.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("inicio.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 350, 500);
                stage.setTitle("pagina inicio");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
