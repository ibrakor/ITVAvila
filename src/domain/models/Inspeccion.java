package domain.models;

import java.util.Date;

public class Inspeccion {
    private String codInspeccion;
    private String fechaInspeccion;
    private Boolean resultadoInspeccion;
    private Propietario propietario;
    private Vehiculo vehiculo;

    public String getCodInspeccion() {
        return codInspeccion;
    }

    public void setCodInspeccion(String codInspeccion) {
        this.codInspeccion = codInspeccion;
    }

    public String getFechaInspeccion() {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(String fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }

    public Boolean getResultadoInspeccion() {
        return resultadoInspeccion;
    }

    public void setResultadoInspeccion(Boolean resultadoInspeccion) {
        this.resultadoInspeccion = resultadoInspeccion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
