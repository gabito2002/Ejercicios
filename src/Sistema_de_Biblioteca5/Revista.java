package Sistema_de_Biblioteca5;

public class Revista extends ItemBiblioteca implements Prestamo{
    private boolean prestado = false;

    public Revista(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
    }

    @Override
    public void Prestar() {
    if(!prestado){
            prestado = true;
            System.out.println("Revista prestada: "+getInfo());
        } else {
            System.out.println("La Revista ya esta prestada.");
        }
    }

    @Override
    public void Devolver() {
        prestado = false;
        System.out.println("Revista devuelta: "+getInfo());
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }
}