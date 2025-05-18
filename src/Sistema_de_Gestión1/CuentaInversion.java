package Sistema_de_Gestión1;

public class CuentaInversion extends CuentaBancaria {

    private double tasaGanancia;

    public CuentaInversion(double balanceInicial, double tasaGanancia) {
        super(balanceInicial);
        this.tasaGanancia = tasaGanancia;
    }

    @Override
    public void ingresar(double monto) {
        balance += monto;
    }

    @Override
    public void extraer(double monto) {
        if (monto <= balance) {
            balance -= monto;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    @Override
    public double calcularGanancia() {
        return balance * tasaGanancia;
    }
}
