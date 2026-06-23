
public abstract class CuentaBancaria {

    private String iban;
    private double saldo;
    private Cliente titular;


    public CuentaBancaria(String iban, Cliente titular, double saldoInicial) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double obtenerSaldo() {
        return saldo;
    }


    public String obtenerIban() {
        return iban;
    }


    public Cliente obtenerTitular() {
        return titular;
    }


    public int ingresar(double cantidad) {
        if (cantidad < 0) {
            return 1;
        }
        if (cantidad == 0) {
            return 2;
        }
        saldo = saldo + cantidad;
        return 0;
    }


    public int retirar(double cantidad) {
        if (cantidad < 0) {
            return 1;
        }
        if (cantidad == 0) {
            return 2;
        }
        if (cantidad > saldo) {
            return 3;
        }
        saldo = saldo - cantidad;
        return 0;
    }


    public abstract String obtenerTipoCuenta();
}
