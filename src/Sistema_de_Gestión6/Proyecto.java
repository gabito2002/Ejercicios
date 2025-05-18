package Sistema_de_Gestión6;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    public class Tarea {
        private final String nombre;
        private final String descripcion;

        public Tarea(String nombre, String descripcion) {
            this.nombre = nombre;
            this.descripcion = descripcion;
        }

        @Override
        public String toString() {
            return "Tarea: " + nombre + " - " + descripcion;
        }
    }

    private String nombreProyecto;
    private List<Tarea> tareas;

    public Proyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(String nombreTarea) {
        tareas.removeIf(t -> t.nombre.equals(nombreTarea));
    }

    public void listarTareas() {
        tareas.forEach(System.out::println);
    }
}