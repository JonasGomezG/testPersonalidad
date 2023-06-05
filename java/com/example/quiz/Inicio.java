package main.java.com.example.quiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Inicio {


    @FXML
    private AnchorPane Pane;

    @FXML
    private Button botonInicio;

    public static class ControladorSolucion {

        @FXML
        private ImageView imgSolucion;

        @FXML
        private void initialize() {
            //Muestro imagen inicial
            Image imagen = new Image("images/ImagenPortada.jpg");
            imgSolucion.setImage(imagen);

        }
    }

    //Al pulsar empezar vamos a preguntas
    @FXML
    void iniciar(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("preguntas.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
}
