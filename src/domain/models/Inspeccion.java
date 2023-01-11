package domain.models;

import java.util.Date;

public class Inspeccion {
    private String codInspeccion;
    private Date fechaInspeccion;
    private Boolean resultadoInspeccion;

    public String getCodInspeccion() {
        return codInspeccion;
    }

    public void setCodInspeccion(String codInspeccion) {
        this.codInspeccion = codInspeccion;
    }

    public Date getFechaInspeccion() {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(Date fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }

    public Boolean getResultadoInspeccion() {
        return resultadoInspeccion;
    }

    public void setResultadoInspeccion(Boolean resultadoInspeccion) {
        this.resultadoInspeccion = resultadoInspeccion;
    }
}
