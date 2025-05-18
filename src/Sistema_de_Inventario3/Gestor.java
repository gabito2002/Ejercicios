package Sistema_de_Inventario3;

public class Gestor {
    public static void gestionarVehiculo(Vehiculo v) {
        v.encender();
        v.apagar();

        switch (v) {
            case Coche c -> c.abrirMaletero();
            case Moto m -> m.levantarPatilla();
            case Camion cam -> cam.activarFrenosAire();
            default -> {
            }
        }
    }
}

