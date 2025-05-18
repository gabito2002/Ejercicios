package Sistema_de_Biblioteca5;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("La Metamorfosis", "Franz Kafka", 1915);
        Revista revista1 = new Revista("Time","Exclusive: Inside Trump’s First 100 Days",2025);
        DVD dvd1 = new DVD("Asu Mare", "Carlos Alcantara",2013);
        
        RegistroPrestamo registro = new RegistroPrestamo();
        registro.Prestar(libro1);
        registro.Prestar(revista1);
        registro.Prestar(dvd1);
        
        System.out.println("\n--- Estado de objeto:");
        registro.mostrarEstado();
        
        System.out.println("\n--- Devoluciones");
        registro.Devolver();
        
        System.out.println("\n--- Estado final:");
        registro.mostrarEstado();        
    }
}