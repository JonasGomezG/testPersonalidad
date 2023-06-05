package main.java.com.example.models;

public class RespuestaModel {

    private int id;
    private String respuesta;
    private int pregunataId;
    private int resultadoId;

    public RespuestaModel(int id, String respuesta, int pregunataId, int resultadoId) {
        this.id = id;
        this.respuesta = respuesta;
        this.pregunataId = pregunataId;
        this.resultadoId = resultadoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getPregunataId() {
        return pregunataId;
    }

    public void setPregunataId(int pregunataId) {
        this.pregunataId = pregunataId;
    }

    public int getResultadoId() {
        return resultadoId;
    }

    public void setResultadoId(int resultadoId) {
        this.resultadoId = resultadoId;
    }
}
