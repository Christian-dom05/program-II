package model;

public class Usuario implements ModeloUsuario{
    String nombre, email, contrasena;
    public Usuario(String nombre, String email, String contrasena){
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }
    @Override
    public String getNombreCompleto() {
        return nombre;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "--------------------" + "\n"+
                "Nombre: "+nombre + "\n"+
                "Email: "+email;
    }
}
