package main.java.com.example.services;

import main.java.com.example.models.PreguntaModel;
import main.java.com.example.models.RespuestaModel;

import java.sql.*;
import java.util.ArrayList;

public class Service {

    //Recojo las preguntas por el id
    public static PreguntaModel getPreguntasById(int id) throws ClassNotFoundException {

        Statement sentenciaSQL = null;
        String sql = "";
        ResultSet rs;
        PreguntaModel pregunta = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/lordofrings", "root", "");

            sentenciaSQL = conexion.createStatement();

            sql = "SELECT * FROM preguntas where id='"+ id +"'";

            rs = sentenciaSQL.executeQuery(sql);
            while (rs.next()) {
                pregunta = new PreguntaModel(rs.getInt("id"), rs.getString("preguntas"));
                break;
            }

            conexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return pregunta;
    }

    //Recojo las respuestas por el id de la pregunta
    public static ArrayList<RespuestaModel> getRespuestasByid(int id) throws ClassNotFoundException {
        ArrayList<RespuestaModel> respuestas = new ArrayList<RespuestaModel>();
        Statement sentenciaSQL = null;
        String sql = "";
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/lordofrings", "root", "");

            sentenciaSQL = conexion.createStatement();

            sql = "SELECT * FROM respuestas where pregunta_id='"+ id +"'";

            rs = sentenciaSQL.executeQuery(sql);
            while (rs.next()) {
                RespuestaModel respuesta = new RespuestaModel(rs.getInt("id"), rs.getString("respuesta"),
                        rs.getInt("pregunta_id"),rs.getInt("resultado_id"));
                respuestas.add(respuesta);
            }

            conexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return respuestas;
    }

    //Obtengo el resultado por la respuesta
    public static int getResultadoByName(String name) throws ClassNotFoundException {
        Statement sentenciaSQL = null;
        String sql = "";
        ResultSet rs;
        Integer resultado=0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/lordofrings", "root", "");

            sentenciaSQL = conexion.createStatement();

            sql = "SELECT * FROM respuestas where respuesta='"+ name.toLowerCase() +"'";

            rs = sentenciaSQL.executeQuery(sql);

            while (rs.next()) {
                resultado = rs.getInt("resultado_id");
                break;
            }

            conexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

    //Obtengo el personaje por el id
    public static String getPersonajeById(int id) throws ClassNotFoundException {
        Statement sentenciaSQL = null;
        String sql = "";
        ResultSet rs;
        String nombre="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/lordofrings", "root", "");

            sentenciaSQL = conexion.createStatement();

            sql = "SELECT * FROM resultado where id='"+ id +"'";

            rs = sentenciaSQL.executeQuery(sql);

            while (rs.next()) {
                nombre = rs.getString("personaje");
                break;
            }

            conexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return nombre;
    }
}
