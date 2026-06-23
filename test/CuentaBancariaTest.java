import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CuentaBancariaTest {

    private CuentaCorriente crearCuenta(double saldoInicial) {
        Cliente cliente = new Cliente("12345678A", "Ana", "Lopez", "ana@email.com");
        return new CuentaCorriente("ES001", cliente, saldoInicial, 12);
    }


    public void testIngresarCantidadCorrecta() {
        CuentaCorriente cuenta = crearCuenta(100);
        int resultado = cuenta.ingresar(50);
        assertEquals(0, resultado);
        assertEquals(150, cuenta.obtenerSaldo(), 0.01);
    }


    @Test
    public void testIngresarCantidadNegativa() {
        CuentaCorriente cuenta = crearCuenta(100);
        int resultado = cuenta.ingresar(-20);
        assertEquals(1, resultado);
        assertEquals(100, cuenta.obtenerSaldo(), 0.01);
    }

}


