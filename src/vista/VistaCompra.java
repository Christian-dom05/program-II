package vista;

import controlador.ControladorCompra;
import modelo.Producto;

import javax.swing.*;
import javax.xml.transform.Source;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VistaCompra extends JFrame implements IVistaCompra {
    private JTextField campoPagado = new JTextField("0.00");
    private JTextField campoTotal = new JTextField("0.00");
    private JTextField campoCambio = new JTextField("0.00");
    private JTextArea areaPedidos = new JTextArea(10, 20);
    private JPanel panelProductos = new JPanel(new GridLayout(0, 1));
    private JPanel panelMontos = new JPanel(new GridLayout(0, 1));

    private ControladorCompra controlador;

    public VistaCompra(List<Producto> listaProductos) {
        setTitle("Sistema de Compras");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        controlador = new ControladorCompra();

        campoPagado.setEditable(false);
        campoTotal.setEditable(false);
        campoCambio.setEditable(false);
        areaPedidos.setEditable(false);

        for (int monto : new int[]{1, 5, 10, 20, 50}) {
            JButton btn = new JButton( monto + " Bs");
            btn.setBackground(Color.LIGHT_GRAY);
            btn.setForeground(Color.black);
            btn.addActionListener(e -> {
                controlador.agregarPago(monto);
                setPagado(monto);
                System.out.println("pago agregado "+monto);
            });
            panelMontos.add(btn);
        }


        for (Producto p : listaProductos) {
            JButton btn = new JButton(p.toString());
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            panelProductos.add(btn);
        }

        JPanel panelInfo = new JPanel(new GridLayout(4, 2));
        panelInfo.add(new JLabel("Pagado:")); panelInfo.add(campoPagado);
        panelInfo.add(new JLabel("Total:")); panelInfo.add(campoTotal);
        panelInfo.add(new JLabel("Cambio:")); panelInfo.add(campoCambio);
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoPagado.setText("0.00");
                campoTotal.setText("0.00");
                campoCambio.setText("0.00");
            }
        });

        panelInfo.add(new JLabel()); panelInfo.add(btnLimpiar);

        add(panelMontos, BorderLayout.WEST);
        add(panelProductos, BorderLayout.CENTER);
        add(new JScrollPane(areaPedidos), BorderLayout.EAST);
        add(panelInfo, BorderLayout.SOUTH);

        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public void setControlador(ControladorCompra c) {
        this.controlador = c;
    }

    public void setPagado(double monto) {
        campoPagado.setText(String.valueOf(monto));
    }

    public void setTotal(double monto) {
        campoTotal.setText(String.valueOf(monto));
    }

    public void setCambio(double monto) {
        campoCambio.setText(String.valueOf(monto));
    }

    @Override
    public void setPedidos(List<Producto> productos) {
        areaPedidos.setText("");
        for (Producto p : productos) {
            areaPedidos.append(p.toString() + "\n");
        }
    }
}
