package main.java.com.example.models;

public class PreguntaModel {
    private int id;
    private String pregunta;

    public PreguntaModel(int id, String pregunta) {
        this.id = id;
        this.pregunta = pregunta;
    }

    public int getId() {
        return id;
    }

    public String getPregunta() {
        return pregunta;
    }
}
