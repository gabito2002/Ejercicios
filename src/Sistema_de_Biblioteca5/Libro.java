package Sistema_de_Biblioteca5;

public class Libro extends ItemBiblioteca implements Prestamo{
    private boolean prestado = false;

    public Libro(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
    }

    @Override
    public void Prestar() {
    if(!prestado){
            prestado = true;
            System.out.println("Libro prestado: "+getInfo());
        } else {
            System.out.println("El libro ya esta prestado.");
        }
    }

    @Override
    public void Devolver() {
        prestado = false;
        System.out.println("Libro devuelto: "+getInfo());
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }
}