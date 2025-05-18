
package Sistema_de_Inventario3;

public class Moto extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("Moto encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Moto apagada");
    }

    public void levantarPatilla() {
        System.out.println("Patilla de la moto levantada");
    }
}

