package data;

import domain.models.Propietario;

import java.util.Map;
import java.util.TreeMap;

public class PropietarioDataStore {
    private static PropietarioDataStore instance = null;

    private Map<String, Propietario> dataStore = new TreeMap<>();

    public void save(Propietario propietario){
        dataStore.put(propietario.getDni(), propietario);
    }
    public void delete(String codigo){
        dataStore.remove(codigo);
    }
    public Propietario search(String codigo){
        return dataStore.get(codigo);
    }

    public void update(Propietario propietario){
        dataStore.put(propietario.getDni(), propietario);
    }
    public static PropietarioDataStore getInstance(){
        if (instance==null){
           instance = new PropietarioDataStore();
        }
        return instance;
    }
}
