package Sistema_de_Gestión1;

public class CuentaAhorro extends CuentaBancaria {
    private final double tasaGanancia = 0.02; 

    public CuentaAhorro(double balanceInicial) {
        super(balanceInicial);
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