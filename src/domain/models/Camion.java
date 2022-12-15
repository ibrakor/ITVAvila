package domain.models;

import java.util.Date;

public class Camion implements Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Date añomatriculacion;
    private String tara;
    private String longitud;

    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void getMatricula(String matricula) {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void getMarca(String marca) {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void getModelo(String modelo) {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void getColor(String color) {

    }

    @Override
    public void setAñoMatriculacion(String añomatriculacion) {

    }

    @Override
    public void getAñoMatriculacion(String añomatriculacion) {

    }

    public Date getAñomatriculacion() {
        return añomatriculacion;
    }

    public void setAñomatriculacion(Date añomatriculacion) {
        this.añomatriculacion = añomatriculacion;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
