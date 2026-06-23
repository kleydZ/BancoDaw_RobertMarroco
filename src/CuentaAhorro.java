
public class CuentaAhorro extends CuentaBancaria {

    private double interesAnual;


    public CuentaAhorro(String iban, Cliente titular, double saldoInicial, double interesAnual) {
        super(iban, titular, saldoInicial);
        this.interesAnual = interesAnual;
    }


    public double obtenerInteresAnual() {
        return interesAnual;
    }


    @Override
    public String obtenerTipoCuenta() {
        return "Ahorro";
    }
}
