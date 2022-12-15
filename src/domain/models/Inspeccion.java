package domain.models;

import java.util.Date;

public class Inspeccion {
    private Integer codInspeccion;
    private Date fechaInspeccion;
    private Boolean resultadoInspeccion;

    public Integer getCodInspeccion() {
        return codInspeccion;
    }

    public void setCodInspeccion(Integer codInspeccion) {
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
