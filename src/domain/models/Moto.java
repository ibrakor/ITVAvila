package domain.models;

import java.util.Date;

public class Moto implements Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Date añomatriculacion;
    private Integer diametroRuedas;

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

    public Date getAñomatriculacion() {
        return añomatriculacion;
    }

    public void setAñomatriculacion(Date añomatriculacion) {
        this.añomatriculacion = añomatriculacion;
    }

    public Integer getDiametroRuedas() {
        return diametroRuedas;
    }

    public void setDiametroRuedas(Integer diametroRuedas) {
        this.diametroRuedas = diametroRuedas;
    }
}
