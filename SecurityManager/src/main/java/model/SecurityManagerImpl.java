package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SecurityManagerImpl implements SecurityManager{
    //List<Usuario> usuarios;
    HashMap<String, Usuario>users;
    public  SecurityManagerImpl(){
        //usuarios = new ArrayList<>();
        users = new HashMap<>();
    }

    @Override
    public boolean registrarUsuario(String nombreCompleto, String email, String contrasena) {
        email = email.toLowerCase();
        if(nombreCompleto != null && email != null && contrasena != null){
            Usuario usuario = new Usuario(nombreCompleto, email, contrasena);
            users.put(email,usuario);
            return true;
        }
        return false;
    }

    @Override
    public boolean autenticarUsuario(String email, String contrasena) {

        for(String mail: users.keySet()){
            if(mail.equals(email)){
                Usuario us = users.get(mail);
                if(us.getContrasena().equals(contrasena)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean cambiarContrasena(String email, String contrasenaActual, String nuevaContrasena) {
        email = email.toLowerCase();
        for(String mail: users.keySet()){
            if(mail.equals(email)){
                Usuario us = users.get(mail);
                us.setContrasena(nuevaContrasena);
                users.put(mail,us);
                return true;
            }
        }
        return false;
    }

    @Override
    public String obtenerNombreCompleto(String email) {
        email = email.toLowerCase();
        for (String mail: users.keySet()){
            if (mail.equals(email)){
                Usuario us = users.get(mail);
                return us.getNombreCompleto();
            }
        }
        return "Email no encontrado";
    }

    @Override
    public List<String> obtenerUsuariosRegistrados() {
        List<String> nombres = new ArrayList<>();
        for(Usuario usuario: users.values()){
            nombres.add(usuario.toString());
        }

        return nombres;
    }
}
