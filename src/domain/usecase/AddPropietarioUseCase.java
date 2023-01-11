package domain.usecase;

import data.PropietarioDataStore;
import domain.models.Propietario;

public class AddPropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();
    public void execute(Propietario propietario){
        dataStore.save(propietario);
    }
}
