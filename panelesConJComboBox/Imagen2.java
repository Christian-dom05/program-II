package panelesConJComboBox;

import javax.swing.*;
import java.awt.*;

public class Imagen2 extends JPanel {
    private ImageIcon imageIcon;
    Imagen2(){
        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("pikachu.png"));
        JLabel etiquetaImagen = new JLabel(imageIcon);
        add(etiquetaImagen);
        setVisible(true);
    }
}
