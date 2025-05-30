package panelesConJComboBox;

import javax.swing.*;
import java.awt.*;

public class Imagen1 extends JPanel {
    private ImageIcon imageIcon;
    Imagen1(){
        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("avatar.jpg"));
        JLabel etiquetaImagen = new JLabel(imageIcon);
        add(etiquetaImagen);
        setVisible(true);
    }
}
