/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.ValidarRegistro;
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
public class RegistroController implements Initializable {

    @FXML
    private Label jLabel1;

    @FXML
    private Label jLabel2;

    @FXML
    private Label jLabel3;

    @FXML
    private TextField contraseñaTF;

    @FXML
    private TextField nombreTF;

    @FXML
    private TextField validarContraseñaTF;

    @FXML
    private Button registrarB;

    @FXML
    private TextField resultadoTF;
    
    @FXML
    void registrarAction(ActionEvent event) {
        String nombre = nombreTF.getText();
        String password = contraseñaTF.getText();
        String rePassword = validarContraseñaTF.getText();
        ValidarRegistro validar = new ValidarRegistro();
        resultadoTF.setText(validar.verificarRegistro(nombre, password, rePassword));
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
