package Frontera;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import Frontera.FXMLPrincipalController;
import javafx.scene.image.Image;
import static javafx.application.Application.launch;

/**
 *
 * @author julia
 */
public class FramePrincipal extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Frontera/FXMLPrincipal.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Login de Usuario");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/user.png")));
        stage.show();
    }

}
