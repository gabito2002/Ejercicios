package Sistema_de_Gestión6;

public class ProyectoSoftware extends Proyecto {
    public ProyectoSoftware(String nombreProyecto) {
        super(nombreProyecto);
    }

    @Override
    public void agregarTarea(Tarea tarea) {
        if (tarea != null) {
            System.out.println("Agregando tarea de software: " + tarea);
            super.agregarTarea(tarea);
        } else {
            System.out.println("Error: La tarea no es válida.");
        }
    }

    public void implementarCodigo() {
        System.out.println("Implementando código...");
    }
}