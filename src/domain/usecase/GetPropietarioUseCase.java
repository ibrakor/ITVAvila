package domain.usecase;

import data.PropietarioDataStore;
import domain.models.Propietario;

public class GetPropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();
    public Propietario execute(String codigo){
        return dataStore.search(codigo);
    }
}
