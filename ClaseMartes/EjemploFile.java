package ClaseMartes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFile {
    public static void main(String[] args) {

        /* verifica si el archivo existe
        File archivo = new File("C:\\Users\\M-80-1\\IdeaProjects\\Viernes13Junio\\src\\archivo.txt");

        if (archivo.exists()){
            System.out.println("El archivo existe.");
            System.out.println("Tamaño: "+archivo.length() + " bytes");
        }else {
            System.out.println("El archivo no existe.");
        }*/

        /* imprime caracteres de un archivo
        try(FileReader fr = new FileReader("C:\\\\Users\\\\M-80-1\\\\IdeaProjects\\\\Viernes13Junio\\\\src\\\\archivo.txt")) { // Lee en formato ASCII
            int caracter;
            while ((caracter = fr.read()) != -1) {
                System.out.println((char) caracter); //System.out.println(caracter); imprime caracteres en codigo ascii
            }
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }*/

        // lee línea por línea
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\M-80-1\\\\IdeaProjects\\\\Viernes13Junio\\\\src\\\\archivo.txt"))){
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
