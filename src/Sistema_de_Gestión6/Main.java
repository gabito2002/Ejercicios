package Sistema_de_Gestión6;
public class Main {

    public static void main(String[] args) {
        ProyectoSoftware proyectoSW = new ProyectoSoftware("Proyecto de Software");
        ProyectoMarketing proyectoMK = new ProyectoMarketing("Proyecto de Marketing");

        Proyecto.Tarea tarea1 = proyectoSW.new Tarea("Desarrollo Frontend", "Crear pagina web");
        Proyecto.Tarea tarea2 = proyectoMK.new Tarea("Base de datos", "Tablas enlazadas");

        proyectoSW.agregarTarea(tarea1);
        proyectoMK.agregarTarea(tarea2);

        System.out.println("\n-- Listado de tareas de Software --");
        proyectoSW.listarTareas();

        System.out.println("\n-- Listado de tareas de Marketing --");
        proyectoMK.listarTareas();
    }   
}