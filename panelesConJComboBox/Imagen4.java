package panelesConJComboBox;

import javax.swing.*;
import java.awt.*;

public class Imagen4 extends JPanel {
    private ImageIcon imageIcon;
    Imagen4(){
        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("sonic.jpg"));
        JLabel etiquetaImagen = new JLabel(imageIcon);
        add(etiquetaImagen);
        setVisible(true);
    }
}
