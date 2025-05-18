package Sistema_de_Gestión1;

public abstract class CuentaBancaria {
    protected double balance;
    
    public CuentaBancaria(double balance) {
        this.balance = balance;
    }
    
    public abstract void ingresar(double monto);
    public abstract void extraer(double monto);
    public abstract double calcularGanancia();
    
    public double obtenerBalance() {
        return balance;
    }
}