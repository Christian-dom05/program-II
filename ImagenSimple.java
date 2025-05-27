import javax.swing.*;

public class ImagenSimple extends JFrame {
    public ImagenSimple(){
        setTitle("Ejemplo simple con imagen");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //ImageIcon imagen = new ImageIcon("");

        ImageIcon imagen = new ImageIcon(getClass().getResource("gato2"));
        JLabel etiquetaImagen = new JLabel(imagen);
        add(etiquetaImagen);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImagenSimple();
    }
}
