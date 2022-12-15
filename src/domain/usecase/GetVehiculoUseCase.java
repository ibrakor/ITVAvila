package domain.usecase;

import data.VehiculosDataStore;
import domain.models.Vehiculo;

public class GetVehiculoUseCase {
    private VehiculosDataStore dataStore = VehiculosDataStore.getInstance();

    public Vehiculo execute(String codigo) {
        return dataStore.search(codigo);
    }
}
