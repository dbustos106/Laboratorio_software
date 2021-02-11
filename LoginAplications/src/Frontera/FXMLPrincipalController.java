/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author julia
 */
public class FXMLPrincipalController implements Initializable {
    
    @FXML
    private Pane jPanel1;

    @FXML
    private ToolBar jToolBar1;

    @FXML
    private Button registroB;

    @FXML
    private Button ingresoB;

    @FXML
    private Pane panelPrincipal;

    @FXML
    void changeToRegistro(ActionEvent event) throws IOException {
        panelPrincipal.getChildren().clear();
        Pane panel2 = (AnchorPane) FXMLLoader.load(getClass().getResource("Registro.fxml"));
        panelPrincipal.getChildren().add(panel2);
    }

    @FXML
    void changeToIngreso(ActionEvent event) throws IOException {
        panelPrincipal.getChildren().clear();
        Pane panel2 = (AnchorPane) FXMLLoader.load(getClass().getResource("Ingreso.fxml"));
        panelPrincipal.getChildren().add(panel2);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {   
        jToolBar1.setBackground(Background.EMPTY);
    }

}
