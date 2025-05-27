package paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gestorPaneles extends JFrame{
    private CardLayout cardLayout;
    private JPanel cardPanel;
    public gestorPaneles(){
        setTitle("Ejemplo con CardLayout");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel buttonPanel = new JPanel();
        String[] nombres = {"Panel1","Panel2","Panel3"};

        for (String nombre: nombres) {
            JButton boton = new JButton(nombre);
            boton.addActionListener(new EjemploPanel.PanelButtonListener(nombre));
            buttonPanel.add(boton);
        }
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        cardPanel.add(new JLabelPanel("Este es el panel 1", Color.LIGHT_GRAY),"Panel1");
        cardPanel.add(new JLabelPanel("Este es el panel 2", Color.CYAN),"Panel2");
        cardPanel.add(new JLabelPanel("Este es el panel 3", Color.PINK),"Panel3");

        cardPanel.add(new Panel(),"Panel1");

        add(buttonPanel,BorderLayout.NORTH);
        add(cardPanel, BorderLayout.CENTER);
        setVisible(true);
    }
    private class PanelButtonListener implements ActionListener {
        private String nombrePanel;
        public PanelButtonListener(String nombrePanel){
            this.nombrePanel = nombrePanel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            cardLayout.show(cardPanel,nombrePanel);
        }
    }
}
