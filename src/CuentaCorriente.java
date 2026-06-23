
public class CuentaCorriente extends CuentaBancaria {

    private double comisionMantenimiento;



    public CuentaCorriente(String iban, Cliente titular, double saldoInicial, double comisionMantenimiento) {
        super(iban, titular, saldoInicial);
        this.comisionMantenimiento = comisionMantenimiento;
    }

    public double obtenerComisionMantenimiento() {
        return comisionMantenimiento;
    }


    @Override
    public String obtenerTipoCuenta() {
        return "Corriente";
    }
}
