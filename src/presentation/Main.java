package presentation;

import domain.models.*;
import domain.usecase.*;

public class Main {
    public static void main(String[] args) {

        Propietario propietario = new Propietario();
        propietario.setDni("0079289K");
        propietario.setNombre("Federico");
        propietario.setApellidos("Garcia Sanchez");
        propietario.setDireccion("Calle Bilbao");
        propietario.setPoblacion("Ávila");
        propietario.setProvincia("Ávila");
        propietario.setTelefono(666777888);

        AddPropietarioUseCase addPropietarioUseCase = new AddPropietarioUseCase();
        addPropietarioUseCase.execute(propietario);

        GetPropietarioUseCase getPropietarioUseCase = new GetPropietarioUseCase();


        Camion camion = new Camion();
        camion.setMarca("Volvo");
        camion.setModelo("Track");
        camion.setColor("Negro");
        camion.setAnomatriculacion("2014");
        camion.setMatricula("48339LL");
        camion.setLongitud("12m");
        camion.setTara("3500kg");

        AddVehiculoUseCase addVehiculoUseCase = new AddVehiculoUseCase();
        addVehiculoUseCase.execute(camion);


        Coche coche = new Coche();
        coche.setMarca("Seat");
        coche.setModelo("León");
        coche.setColor("Amarillo ");
        coche.setAnomatriculacion("2008");
        coche.setMatricula("0000-GYU");
        coche.setnPuertas(5);

        addVehiculoUseCase.execute(coche);

        GetVehiculoUseCase getVehiculoUseCase = new GetVehiculoUseCase();

        Inspeccion inspeccion = new Inspeccion();
        inspeccion.setCodInspeccion("1");
        inspeccion.setFechaInspeccion("01-01-2026");
        inspeccion.setResultadoInspeccion(true);
        inspeccion.setPropietario(propietario);
        inspeccion.setVehiculo(camion);

        AddInspeccionUseCase addInspeccionUseCase = new AddInspeccionUseCase();
        addInspeccionUseCase.execute(inspeccion);

        Inspeccion inspeccion2 = new Inspeccion();
        inspeccion2.setCodInspeccion("2");
        inspeccion2.setFechaInspeccion("01-08-2026");
        inspeccion2.setResultadoInspeccion(true);
        inspeccion2.setPropietario(propietario);
        inspeccion2.setVehiculo(coche);

        addInspeccionUseCase.execute(inspeccion2);

        GetInspeccionUseCase getInspeccionUseCase = new GetInspeccionUseCase();

        InspeccionPrint inspeccionPrint = new InspeccionPrint();

        inspeccionPrint.print(getInspeccionUseCase.execute("1"));
        inspeccionPrint.print(getInspeccionUseCase.execute("2"));



    }
}
