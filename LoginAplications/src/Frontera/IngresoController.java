/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarLogin;
import Entidad.Usuario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author julia
 */
public class IngresoController implements Initializable {

    @FXML
    private Label jlabel1;

    @FXML
    private Label jlabel2;

    @FXML
    private TextField nombreTF;

    @FXML
    private TextField contraseñaTF;

    @FXML
    private Button aceptarB;

    @FXML
    private TextField resultadoTF;
    
    @FXML
    void ingresoAtion(ActionEvent event) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombreTF.getText());
        usuario.setPassword(contraseñaTF.getText());
        ValidarLogin validar = new ValidarLogin();
        String resultado = validar.verificarLogin(usuario);
        resultadoTF.setText(resultado);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
