package main;

import models.Cafeteria;
import ui.WinMenu;

public class Main {

    public static void main(String[] args) {
        Cafeteria cafeteria = new models.MyCafeteria(); //Inicializar la variable cafeteria con su propia implementación

        cafeteria.registrarProducto("123", "Cafe Americano", 12.0);
        cafeteria.registrarProducto("456", "Té Verde", 10.0);
        cafeteria.registrarProducto("789", "Pastel de Chocolate", 15.0);
        cafeteria.registrarProducto("101", "Sandwich Vegetariano", 20.0);

        WinMenu menu = new WinMenu(cafeteria);
        menu.setVisible(true);
    }
}
