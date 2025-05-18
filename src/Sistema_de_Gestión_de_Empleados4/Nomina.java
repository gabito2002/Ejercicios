package Sistema_de_Gestión_de_Empleados4;

import java.util.List;

public class Nomina {
    public static void procesarNomina(List<Empleado> empleados){
        double total = 0;
        for(Empleado e : empleados){
            double salario = e.salarioBase();
            System.out.println(e.getNombre()+ ": $"+salario);
            total += salario;
        }
        System.out.println("Total Nomina: $"+total);
    }

}