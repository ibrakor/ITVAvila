package presentation;

import domain.models.Inspeccion;

public class InspeccionPrint {
    public void print(Inspeccion inspeccion) {
        System.out.println("Cód. Inspección:" + inspeccion.getCodInspeccion());
        System.out.println("Fecha Inspección:" + inspeccion.getFechaInspeccion());
        System.out.println("Resultado Inspección:" + inspeccion.getResultadoInspeccion());
        System.out.println("Propietario: " + inspeccion.getPropietario().getDni() + " " + inspeccion.getPropietario().getNombre() + " " + inspeccion.getPropietario().getApellidos());
        System.out.println("Vehículo: " + inspeccion.getVehiculo().getMatricula() + " " + inspeccion.getVehiculo().getMarca() + " " + inspeccion.getVehiculo().getModelo());
        System.out.println("---------------------------------------");

    }
}
