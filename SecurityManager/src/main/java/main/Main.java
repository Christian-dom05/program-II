package main;

import model.SecurityManager;
import model.SecurityManagerBuilder;

public class Main {

    public static void main(String[] args) {
        SecurityManager securityManager = SecurityManagerBuilder.build();

        String email = "juan@gmail.com";
        String contrasena = "123456";

        boolean seRegsitro = securityManager.registrarUsuario("Juan Perez", email, contrasena);

        if(!seRegsitro){
            System.err.println("Error al registrar el usuario");
            return;
        }

        System.out.println("Usuario registrado correctamente: " + email);


        boolean seAutentico = securityManager.autenticarUsuario(email, contrasena);
        if(!seAutentico){
            System.err.println("Usuario o contrasena incorrectos");
            return;
        }
        System.out.println("Usuario autenticado correctamente: " + email);

        contrasena = "1234567";
        boolean pudoCambiarContrasena = securityManager.cambiarContrasena(email, contrasena, "654321");
        if(!pudoCambiarContrasena){
            System.err.println("No se pudo cambiar la contrasena");
            return;
        }
        System.out.println("Contrasena cambiada correctamente para el usuario: " + email);
        String nombreCompleto = securityManager.obtenerNombreCompleto(email);
        System.out.println("Nombre completo: " + nombreCompleto);



    }
}
