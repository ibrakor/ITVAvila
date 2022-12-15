package domain.models;

import java.util.Date;

public interface Vehiculo {


    String getMatricula();
    String getMarca();
    String getModelo();
    String getColor();
    Date getAñoMatriculacion();
    String setMatricula();
    String setMarca();
    String setModelo();
    String setColor();
    Date setAñoMatriculacion();
}
