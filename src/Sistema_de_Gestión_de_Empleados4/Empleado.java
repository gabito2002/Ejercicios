package Sistema_de_Gestión_de_Empleados4;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    
    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    public abstract double salarioBase();

    public String getNombre() {
        return nombre;
    }
}
