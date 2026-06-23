
public class Operacion {

    private String tipo;
    private double cantidad;
    private String fecha;
    private String resultado;


    public Operacion(String tipo, double cantidad, String fecha, String resultado) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.resultado = resultado;
    }


    public String obtenerResumen() {
        return "Operacion: " + tipo
                + " | Cantidad: " + cantidad
                + " | Fecha: " + fecha
                + " | Resultado: " + resultado;
    }
}
