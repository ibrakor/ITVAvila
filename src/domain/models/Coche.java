package domain.models;

import java.util.Date;

public class Coche implements Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Date añomatriculacion;
    private Integer npuertas;


    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Date getAñoMatriculacion() {
        return añomatriculacion;
    }

    @Override
    public String setMatricula() {
        return matricula;
    }

    @Override
    public String setMarca() {
        return marca;
    }

    @Override
    public String setModelo() {
        return modelo;
    }

    @Override
    public String setColor() {
        return color;
    }

    @Override
    public Date setAñoMatriculacion() {
        return añomatriculacion;
    }
}
