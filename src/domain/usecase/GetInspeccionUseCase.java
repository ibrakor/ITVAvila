package domain.usecase;

import data.InspeccionDataStore;
import data.VehiculosDataStore;
import domain.models.Inspeccion;
import domain.models.Vehiculo;

public class GetInspeccionUseCase {
    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public Inspeccion execute(String codigo) {
        return dataStore.search(codigo);
    }
}
