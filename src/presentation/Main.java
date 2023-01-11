package presentation;

import domain.models.*;

public class Main {
    public static void main(String[] args) {

        Propietario propietario = new Propietario();
        propietario.setDni("0079289K");
        propietario.setNombre("Federico");
        propietario.setApellidos("Garcia Sanchez");
        propietario.setDireccion("Calle Bilbao");
        propietario.setPoblacion("Ávila");
        propietario.setProvincia("Ávila");
        propietario.setTelefono(666777888);

        Camion camion = new Camion();
        camion.setMarca("Volvo");
        camion.setModelo("Track");
        camion.setColor("Negro");
        camion.setAnomatriculacion("2014");
        camion.setMatricula("48339LL");
        camion.setLongitud("12m");
        camion.setTara("3500kg");

        Coche coche = new Coche();
        coche.setMarca("Seat");
        coche.setModelo("León");
        coche.setColor("Amarillo ");
        coche.setAnomatriculacion("2008");
        coche.setMatricula("0000-GYU");
        coche.setnPuertas(5);
    }
}
