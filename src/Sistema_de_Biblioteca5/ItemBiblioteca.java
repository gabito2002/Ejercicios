package Sistema_de_Biblioteca5;

public class ItemBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anio;

    public ItemBiblioteca(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    
    public String getInfo(){
        return titulo + " - " + autor + " ("+anio+")";
    }
}