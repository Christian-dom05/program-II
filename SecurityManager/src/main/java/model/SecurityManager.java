package model;

import java.util.List;

public interface SecurityManager {

    boolean registrarUsuario(String nombreCompleto, String email, String contrasena);
    boolean autenticarUsuario(String email, String contrasena);

    boolean cambiarContrasena(String email, String contrasenaActual, String nuevaContrasena);

    String obtenerNombreCompleto(String email);

    List<String> obtenerUsuariosRegistrados();

}
