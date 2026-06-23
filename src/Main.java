
public class Main {


    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("12345678A", "Robert", "Marroco", "robertmarroco@email.com");
        CuentaCorriente cuenta1 = new CuentaCorriente("ES001", cliente1, 100, 12);
        CuentaAhorro cuenta2 = new CuentaAhorro("ES002", cliente1, 500, 2.5);

        System.out.println("=== Datos del cliente ===");
        System.out.println("Cliente : " + cliente1.obtenerNombreCompleto());
        System.out.println("DNI     : " + cliente1.obtenerDni());
        System.out.println("Email   : " + cliente1.obtenerEmail());
        System.out.println();

        System.out.println("=== Cuenta corriente (ES001) ===");
        System.out.println("Tipo            : " + cuenta1.obtenerTipoCuenta());
        System.out.println("Saldo inicial   : " + cuenta1.obtenerSaldo());
        System.out.println();

        System.out.println("=== Operaciones sobre cuenta corriente ===");

        int r1 = cuenta1.ingresar(200);
        System.out.println("Ingreso 200   -> codigo " + r1 + " | Saldo: " + cuenta1.obtenerSaldo());

        int r2 = cuenta1.ingresar(50);
        System.out.println("Ingreso 50    -> codigo " + r2 + " | Saldo: " + cuenta1.obtenerSaldo());

        int r3 = cuenta1.retirar(80);
        System.out.println("Retirada 80   -> codigo " + r3 + " | Saldo: " + cuenta1.obtenerSaldo());

        int r4 = cuenta1.retirar(100);
        System.out.println("Retirada 100  -> codigo " + r4 + " | Saldo: " + cuenta1.obtenerSaldo());

        int r5 = cuenta1.ingresar(-30);
        System.out.println("Ingreso -30   -> codigo " + r5 + " | Saldo: " + cuenta1.obtenerSaldo() + " (sin cambio)");

        int r6 = cuenta1.ingresar(0);
        System.out.println("Ingreso 0     -> codigo " + r6 + " | Saldo: " + cuenta1.obtenerSaldo() + " (sin cambio)");

        int r7 = cuenta1.retirar(9999);
        System.out.println("Retirada 9999 -> codigo " + r7 + " | Saldo: " + cuenta1.obtenerSaldo() + " (sin cambio)");

        int r8 = cuenta1.retirar(-50);
        System.out.println("Retirada -50  -> codigo " + r8 + " | Saldo: " + cuenta1.obtenerSaldo() + " (sin cambio)");

        System.out.println();
        System.out.println("Saldo final cuenta corriente: " + cuenta1.obtenerSaldo());
        System.out.println();

        System.out.println("=== Cuenta ahorro (ES002) ===");
        System.out.println("Tipo          : " + cuenta2.obtenerTipoCuenta());
        System.out.println("Saldo inicial : " + cuenta2.obtenerSaldo());
        System.out.println("Interes anual : " + cuenta2.obtenerInteresAnual() + "%");

        Operacion op = new Operacion("ingreso", 100, "2026-05-24", "correcto");
        cuenta2.ingresar(100);
        System.out.println("Operacion: " + op.obtenerResumen());
        System.out.println("Saldo final cuenta ahorro: " + cuenta2.obtenerSaldo());
    }
}
