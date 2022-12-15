package data;

import domain.models.Vehiculo;

import java.util.Map;
import java.util.TreeMap;

public class VehiculosDataStore {
    private static VehiculosDataStore instance = null;

    private Map<String, Vehiculo> dataStore = new TreeMap<>();

    public void save(Vehiculo vehiculo) {
        dataStore.put(vehiculo.getMatricula(), vehiculo);
    }

    public Vehiculo search(String codigo) {
        return dataStore.get(codigo);
    }


    public static VehiculosDataStore getInstance() {
        if (instance == null) {
            instance = new VehiculosDataStore();
        }
        return instance;
    }
}
