import javax.swing.*;
import java.awt.*;

public class JLabelPanel extends JPanel {
    private String texto;
    private Color colorFondo;
    public JLabelPanel(String texto, Color colorFondo){
        this.texto = texto;
        this.colorFondo = colorFondo;
        setBackground(colorFondo);
        add(new JLabel(texto));
    }
}
