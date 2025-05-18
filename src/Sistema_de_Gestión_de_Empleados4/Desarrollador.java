package Sistema_de_Gestión_de_Empleados4;

public class Desarrollador extends Empleado{

    public Desarrollador(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
    
    @Override
    public double salarioBase() {
        return salarioBase + salarioBase * 0.45;
    }
}