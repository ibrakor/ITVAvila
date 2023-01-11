package domain.models;

import java.util.Date;

public class Camion implements Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String anomatriculacion;
    private String tara;
    private String longitud;

    @Override
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnomatriculacion() {
        return anomatriculacion;
    }

    public void setAnomatriculacion(String anomatriculacion) {
        this.anomatriculacion = anomatriculacion;
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
