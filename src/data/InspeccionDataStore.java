package data;

import domain.models.Inspeccion;
import domain.models.Vehiculo;

import java.util.Map;
import java.util.TreeMap;

public class InspeccionDataStore {
    private static InspeccionDataStore instance = null;

    private Map<String, Inspeccion> dataStore = new TreeMap<>();

    public void save(Inspeccion inspeccion) {
        dataStore.put(inspeccion.getCodInspeccion(), inspeccion);
    }

    public Inspeccion search(String codigo) {
        return dataStore.get(codigo);
    }

    public void delete(String codigo) { dataStore.remove(codigo); }

    public void modificar(Inspeccion inspeccion) { dataStore.put(inspeccion.getCodInspeccion(), inspeccion); }


    public static InspeccionDataStore getInstance() {
        if (instance == null) {
            instance = new InspeccionDataStore();
        }
        return instance;
    }
}
