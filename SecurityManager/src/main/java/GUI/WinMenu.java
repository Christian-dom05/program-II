package GUI;

import javax.swing.*;
import java.awt.*;

public class WinMenu extends JFrame {

    protected WinCambioContrasena winCambioContrasena;
    protected WinInicioDeSesion winInicioDeSesion;

    protected CardLayout cardLayout;
    protected JPanel ventana;
    public WinMenu() {
        cardLayout = new CardLayout();
        ventana = new JPanel(cardLayout);

        winCambioContrasena = new WinCambioContrasena();
        winInicioDeSesion = new WinInicioDeSesion();

        ventana.add(winCambioContrasena,"Contrasena");
        ventana.add(winInicioDeSesion, "Inicio");

        add(ventana);

        cardLayout.show(ventana, "Inicio");

        setTitle("Inicio de sesion");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 500);
        setVisible(true);
    }

    public void showWinCambioContrasena() {
        cardLayout.show(ventana,"Contrasena");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WinMenu::new);
    }
}
