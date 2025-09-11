package practicoViernes12.modelo;

/**
 * nombre,apellido,ci,direccion,telefono
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int ci;
    private String direccion;
    private int telefono;
    public Persona(String nombre, String apellido, int ci, String direccion, int telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
