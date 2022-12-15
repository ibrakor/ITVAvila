package domain.usecase;

import data.VehiculosDataStore;
import domain.models.Vehiculo;

public class AddVehiculoUseCase {
    private static VehiculosDataStore dataStore = VehiculosDataStore.getInstance();

    public static void execute(Vehiculo vehiculo) {
        dataStore.save(vehiculo);
    }
}
