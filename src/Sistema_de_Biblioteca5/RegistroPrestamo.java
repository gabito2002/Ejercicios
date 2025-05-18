package Sistema_de_Biblioteca5;
import java.util.ArrayList;
import java.util.List;

public class RegistroPrestamo {
    private final List<Prestamo> historial = new ArrayList<>();
    
    public void Prestar(Prestamo p){
        historial.add(p);
        p.Prestar();
    }
    
    public void Devolver(){
        for(Prestamo p : historial){
            p.Devolver();
        }
    }
    
    public void mostrarEstado(){
        for(Prestamo p : historial){
            //condicional de alternancia ?
            String estado = p.estaPrestado() ? "Prestado" : "Disponible";
            if(p instanceof ItemBiblioteca itemBiblioteca){
                System.out.println(itemBiblioteca.getInfo()+" - Estado:"+estado);
            }
        }
    }
}