package main.java.com.example.quiz;

import main.java.com.example.models.PreguntaModel;
import main.java.com.example.models.RespuestaModel;
import main.java.com.example.services.Service;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("portada.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("¡QUIZ! - ¿Que personaje de El Señor de los Anillos eres?");

        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args)  {
        launch();
    }

}