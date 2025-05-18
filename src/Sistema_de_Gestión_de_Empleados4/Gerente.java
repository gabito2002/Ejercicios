package Sistema_de_Gestión_de_Empleados4;

public class Gerente extends Empleado{

    public Gerente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }   

    @Override
    public double salarioBase() {
        return salarioBase + 5000;
    }
}