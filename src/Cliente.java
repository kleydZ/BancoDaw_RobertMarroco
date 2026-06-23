
public class Cliente {

    private String dni;
    private String nombre;
    private String apellidos;
    private String email;


    public Cliente(String dni, String nombre, String apellidos, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }


    public String obtenerDni() {
        return dni;
    }


    public String obtenerNombreCompleto() {
        return nombre + " " + apellidos;
    }


    public String obtenerEmail() {
        return email;
    }


    public void cambiarEmail(String nuevoEmail) {
        this.email = nuevoEmail;
    }
}
