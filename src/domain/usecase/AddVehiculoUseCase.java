package domain.usecase;

import data.VehiculosDataStore;
import domain.models.Vehiculo;

public class AddVehiculoUseCase {
    private VehiculosDataStore dataStore = VehiculosDataStore.getInstance();

    public void execute(Vehiculo vehiculo) {
        dataStore.save(vehiculo);
    }
}
