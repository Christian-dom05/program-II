package panelesConJComboBox;

import javax.swing.*;
import java.awt.*;

public class Imagen5 extends JPanel {
    private ImageIcon imageIcon;
    Imagen5(){
        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("series.jpg"));
        JLabel etiquetaImagen = new JLabel(imageIcon);
        add(etiquetaImagen);
        setVisible(true);
    }
}
