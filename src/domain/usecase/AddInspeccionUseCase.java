package domain.usecase;

import data.InspeccionDataStore;
import data.VehiculosDataStore;
import domain.models.Inspeccion;
import domain.models.Vehiculo;

public class AddInspeccionUseCase {
    private static InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public static void execute(Inspeccion inspeccion) {
        dataStore.save(inspeccion);
    }
}
