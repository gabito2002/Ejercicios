
package Sistema_de_Inventario3;

public class Coche extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("Coche encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Coche apagado");
    }

    public void abrirMaletero() {
        System.out.println("Abriendo maletero del coche");
    }
}
