package Sistema_de_Biblioteca5;

public class DVD extends ItemBiblioteca implements Prestamo{
    private boolean prestado = false;

    public DVD(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
    }

    @Override
    public void Prestar() {
    if(!prestado){
            prestado = true;
            System.out.println("DVD prestado: "+getInfo());
        } else {
            System.out.println("El DVD ya esta prestado.");
        }
    }

    @Override
    public void Devolver() {
        prestado = false;
        System.out.println("DVD devuelto: "+getInfo());
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }
}