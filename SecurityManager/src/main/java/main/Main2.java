package main;

import model.ModeloUsuario;
import model.SecurityManager;
import model.SecurityManagerBuilder;

import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        SecurityManager manager = SecurityManagerBuilder.build();

        manager.registrarUsuario("Juan Perez", "juan@gmail.com", "123456");
        manager.registrarUsuario("Maria Lopez", "maria@gmail.com", "abcdef");
        manager.registrarUsuario("Carlos Gomez", "carlos@gmail.com", "qwerty");

        System.out.println("Usuarios registrados:");

        List<String> usuariosRegistrados = manager.obtenerUsuariosRegistrados();
        for(String usuario : usuariosRegistrados) {
            System.out.println(usuario);
        }
    }
}
