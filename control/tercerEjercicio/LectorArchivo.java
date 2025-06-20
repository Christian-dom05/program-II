package control.tercerEjercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class LectorArchivo {
    ArrayList<Producto> productos;
    public LectorArchivo(){
        productos = new ArrayList<>();
    }
    public void leerArchivo(){
        File archivo = new File("C:\\Users\\M-305\\IdeaProjects\\Auto.java\\src\\control\\tercerEjercicio\\productos.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = br.readLine())!=null){
                String[] datos = linea.split("[\\-]"); // aqui salta error
                if(datos.length>=2){
                    String nombre = datos[0];
                    double precio = Double.parseDouble(datos[2]);
                    productos.add(new Producto(nombre,precio));
                }
            }
        }catch (Exception e){
            System.out.println("Error."+e.getMessage());
        }
    }

    public void info(){
        double precio;
        for (Producto p: productos){
            precio = p.getPrecio();
            if(precio>1){
                System.out.println("Nombre: "+p.getNombre()+"\n"+
                        "Precio: "+p.getPrecio());
            }
        }
    }

    public static void main(String[] args) {
        LectorArchivo la = new LectorArchivo();
        la.leerArchivo();
        la.info();
    }
}
