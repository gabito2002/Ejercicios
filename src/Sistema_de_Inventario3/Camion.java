package Sistema_de_Inventario3;

public class Camion extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("Camión encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Camión apagado");
    }

    public void activarFrenosAire() {
        System.out.println("Frenos de aire activados");
    }
}