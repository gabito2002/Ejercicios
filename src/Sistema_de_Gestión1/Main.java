package Sistema_de_Gestión1;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cc = new CuentaCorriente(9000);
        CuentaBancaria ca = new CuentaAhorro(4500);
        CuentaBancaria ci = new CuentaInversion(8000, 0.06);

        System.out.println("Ganancia Cuenta Corriente: " + cc.calcularGanancia());
        System.out.println("Ganancia Cuenta Ahorro: " + ca.calcularGanancia());
        System.out.println("Ganancia Cuenta Inversion: " + ci.calcularGanancia());
    }
}
