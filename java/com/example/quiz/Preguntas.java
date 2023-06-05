package main.java.com.example.quiz;
import main.java.com.example.models.PreguntaModel;
import main.java.com.example.models.RespuestaModel;
import main.java.com.example.services.Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ArrayList;


//La primera pregunta se carga por defecto desde el scene builder
public class Preguntas {

    //Contador de preguntas
    private int contador=2;
    //Estas son la puntuaciones por cada uno de los personajes
    private int personaje1=0;
    private int personaje2=0;
    private int personaje3=0;
    private int personaje4=0;
    private int personaje5=0;
    private int personaje6=0;
    @FXML
    private Label pregunta;

    @FXML
    private Button respuesta1;

    @FXML
    private Button respuesta4;

    @FXML
    private Button respuesta3;

    @FXML
    private Button respuesta2;

    @FXML
    void respuesta1(ActionEvent event) throws ClassNotFoundException {

        if(contador<10) {

            //Busco la siguiente pregunta
            PreguntaModel sgtePregunta = Service.getPreguntasById(contador);
            pregunta.setText(sgtePregunta.getPregunta());

            //Busco las siguientes respuestas y avanzando con el contador las pinto en su posición
            int contadorRespuesta = 0;
            ArrayList<RespuestaModel> respuestas = Service.getRespuestasByid(contador);

            RespuestaModel sgteRespuestas1 = respuestas.get(contadorRespuesta);
            respuesta1.setText(sgteRespuestas1.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas2 = respuestas.get(contadorRespuesta);
            respuesta2.setText(sgteRespuestas2.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas3 = respuestas.get(contadorRespuesta);
            respuesta3.setText(sgteRespuestas3.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas4 = respuestas.get(contadorRespuesta);
            respuesta4.setText(sgteRespuestas4.getRespuesta());

            //Contabilizo puntuación
            Button b = (Button) event.getSource();
            modificaPuntuacion(contador, b.getText());

            contador++;
        }
        else{
            showWin();
        }
    }

    @FXML
    void respuesta2(ActionEvent event) throws ClassNotFoundException {

        if(contador<10) {

            PreguntaModel sgtePregunta = Service.getPreguntasById(contador);
            pregunta.setText(sgtePregunta.getPregunta());

            int contadorRespuesta = 0;
            ArrayList<RespuestaModel> respuestas = Service.getRespuestasByid(contador);

            RespuestaModel sgteRespuestas1 = respuestas.get(contadorRespuesta);
            respuesta1.setText(sgteRespuestas1.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas2 = respuestas.get(contadorRespuesta);
            respuesta2.setText(sgteRespuestas2.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas3 = respuestas.get(contadorRespuesta);
            respuesta3.setText(sgteRespuestas3.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas4 = respuestas.get(contadorRespuesta);
            respuesta4.setText(sgteRespuestas4.getRespuesta());

            Button b = (Button) event.getSource();
            modificaPuntuacion(contador, b.getText());

            contador++;
        } else{
            showWin();
        }
    }

    @FXML
    void respuesta3(ActionEvent event) throws ClassNotFoundException {

        if(contador<10) {

            PreguntaModel sgtePregunta = Service.getPreguntasById(contador);
            pregunta.setText(sgtePregunta.getPregunta());

            int contadorRespuesta = 0;
            ArrayList<RespuestaModel> respuestas = Service.getRespuestasByid(contador);

            RespuestaModel sgteRespuestas1 = respuestas.get(contadorRespuesta);
            respuesta1.setText(sgteRespuestas1.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas2 = respuestas.get(contadorRespuesta);
            respuesta2.setText(sgteRespuestas2.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas3 = respuestas.get(contadorRespuesta);
            respuesta3.setText(sgteRespuestas3.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas4 = respuestas.get(contadorRespuesta);
            respuesta4.setText(sgteRespuestas4.getRespuesta());

            Button b = (Button) event.getSource();
            modificaPuntuacion(contador, b.getText());

            contador++;
        } else{
            showWin();
        }
    }

    @FXML
    void respuesta4(ActionEvent event) throws ClassNotFoundException {

        if(contador<10) {

            PreguntaModel sgtePregunta = Service.getPreguntasById(contador);
            pregunta.setText(sgtePregunta.getPregunta());

            int contadorRespuesta = 0;
            ArrayList<RespuestaModel> respuestas = Service.getRespuestasByid(contador);

            RespuestaModel sgteRespuestas1 = respuestas.get(contadorRespuesta);
            respuesta1.setText(sgteRespuestas1.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas2 = respuestas.get(contadorRespuesta);
            respuesta2.setText(sgteRespuestas2.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas3 = respuestas.get(contadorRespuesta);
            respuesta3.setText(sgteRespuestas3.getRespuesta());
            contadorRespuesta++;

            RespuestaModel sgteRespuestas4 = respuestas.get(contadorRespuesta);
            respuesta4.setText(sgteRespuestas4.getRespuesta());

            Button b = (Button) event.getSource();
            modificaPuntuacion(contador, b.getText());

            contador++;
        } else{
            showWin();
        }
    }

    //Esta clase nos dice cual es el personaje ganador comparando cual de los personajes tiene más puntuación
    public void showWin() throws ClassNotFoundException {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Tu eres como...");
        if(personaje1 > personaje2 && personaje1 > personaje3 && personaje1 > personaje4 && personaje1 > personaje5 && personaje1 > personaje6){
            alert.setHeaderText(Service.getPersonajeById(1));
        }else if(personaje2 > personaje1 && personaje2 > personaje3 && personaje2 > personaje4 && personaje2 > personaje5 && personaje2 > personaje6){
            alert.setHeaderText(Service.getPersonajeById(2));
        }else if(personaje3 > personaje1 && personaje3 > personaje1 && personaje3 > personaje4 && personaje3 > personaje5 && personaje3 > personaje6){
            alert.setHeaderText(Service.getPersonajeById(3));
        }else if(personaje4 > personaje1 && personaje4 > personaje2 && personaje4 > personaje3 && personaje4 > personaje5 && personaje4 > personaje6){
            alert.setHeaderText(Service.getPersonajeById(4));
        }else if(personaje5 > personaje1 && personaje5 > personaje2 && personaje5 > personaje3 && personaje5 > personaje4 && personaje5 > personaje6){
            alert.setHeaderText(Service.getPersonajeById(5));
        }else{
            alert.setHeaderText(Service.getPersonajeById(6));
        }
        alert.show();
    }

    //Comprueba cada respuesta a cada pregunta y contabiliza
    public void modificaPuntuacion(int pregunta, String respuesta) throws ClassNotFoundException {
        switch (contador){
            case 1:
                Integer resultado = Service.getResultadoByName(respuesta);
                contador(resultado);
                break;
            case 2:
                Integer resultado2 = Service.getResultadoByName(respuesta);
                contador(resultado2);
                break;
            case 3:
                Integer resultado3 = Service.getResultadoByName(respuesta);
                contador(resultado3);
                break;
            case 4:
                Integer resultado4 = Service.getResultadoByName(respuesta);
                contador(resultado4);
                break;
            case 5:
                Integer resultado5 = Service.getResultadoByName(respuesta);
                contador(resultado5);
                break;
            case 6:
                Integer resultado6 = Service.getResultadoByName(respuesta);
                contador(resultado6);
                break;
            case 7:
                Integer resultado7 = Service.getResultadoByName(respuesta);
                contador(resultado7);
                break;
            case 8:
                Integer resultado8 = Service.getResultadoByName(respuesta);
                contador(resultado8);
                break;
            case 9:
                Integer resultado9 = Service.getResultadoByName(respuesta);
                contador(resultado9);
                break;
            default:
                Integer resultado10 = Service.getResultadoByName(respuesta);
                contador(resultado10);
                break;

        }

    }

    // por cada caso es un punto más al personaje
    public void contador(int personaje){
        switch (personaje){
            case 1:
                personaje1++;
                break;
            case 2:
                personaje2++;
                break;
            case 3:
                personaje3++;
                break;
            case 4:
                personaje4++;
                break;
            case 5:
                personaje5++;
                break;
            default:
                personaje6++;
                break;
        }

    }

}
