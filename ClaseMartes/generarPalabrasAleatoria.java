package ClaseMartes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.Random;

public class generarPalabrasAleatoria {
    public static String generarPalabraAleatoria(int longitud) {
        StringBuilder palabra = new StringBuilder();
        Random random = new Random();
        String caracteres = "abcdefghijk1234567ABCDEFG";

        for (int i=0; i< longitud; i++){
            int indice = random.nextInt(caracteres.length());
            palabra.append(caracteres.charAt(indice)); // añade una letra aleatoria con append
        }
        return palabra.toString();
    }

    public static void main(String[] args) {
        String archivo = "palabras_aleatorias.txt";
        int numeroDePalabras = 10;
        int longitudPalabra = 8;

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(archivo,true))){
            for (int i = 0; i < numeroDePalabras; i++){
                String palabra = generarPalabraAleatoria(longitudPalabra);
                writer.write(palabra+"\n");
            }
            System.out.println("Palabras aleatorias generadas y guardadas en "+archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
