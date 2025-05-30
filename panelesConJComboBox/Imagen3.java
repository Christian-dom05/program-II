package panelesConJComboBox;

import javax.swing.*;
import java.awt.*;

public class Imagen3 extends JPanel {
    private ImageIcon imageIcon;
    Imagen3(){
        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("link zelda.jpg"));
        JLabel etiquetaImagen = new JLabel(imageIcon);
        add(etiquetaImagen);
        setVisible(true);
    }
}
