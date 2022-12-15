package presentation;

import domain.models.Coche;
import domain.models.Inspeccion;
import domain.models.Vehiculo;
import domain.usecase.AddVehiculoUseCase;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Coche BMWX5 = new Coche();
        BMWX5.setMatricula("98439KLP");
        BMWX5.setColor("Negro");
        BMWX5.setMarca("BMW");
        BMWX5.setAñoMatriculacion("2010");

        AddVehiculoUseCase.execute(BMWX5);

        Inspeccion inspeccion1 = new Inspeccion();
        inspeccion1.setCodInspeccion(1);
        inspeccion1.setFechaInspeccion(new Date());
        inspeccion1.setResultadoInspeccion(Boolean.TRUE);


    }
}
