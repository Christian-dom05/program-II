package panelesConJComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Paneles extends JFrame{
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public Paneles(){
        setTitle("Ejemplo con JComboBox");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel comboPanel = new JPanel();
        String[] nombres = {"Imagen1","Imagen2","Imagen3","Imagen4","Imagen5"};
        JComboBox<String> comboBox = new JComboBox<>(nombres);

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    String itemSeleccionado = (String) comboBox.getSelectedItem();
                    cardLayout.show(cardPanel,itemSeleccionado);
                }
            }
        });

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        cardPanel.add(new Imagen1(),"Imagen1");
        cardPanel.add(new Imagen2(),"Imagen2");
        cardPanel.add(new Imagen3(),"Imagen3");
        cardPanel.add(new Imagen4(),"Imagen4");
        cardPanel.add(new Imagen5(),"Imagen5");

        comboPanel.add(comboBox);
        add(comboPanel,BorderLayout.NORTH);
        add(cardPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Paneles();
    }
}