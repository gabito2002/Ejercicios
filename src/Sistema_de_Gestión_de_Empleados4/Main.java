package Sistema_de_Gestión_de_Empleados4;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Empleado gerente = new Gerente("Laura",3000);
        Empleado dev = new Desarrollador("Carlos",6000);
        Empleado dis = new Diseñador("Ana",5500);
        
        List<Empleado> lista = Arrays.asList(gerente,dev,dis);
        Nomina.procesarNomina(lista);
    }
}