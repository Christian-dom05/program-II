package control.segundoEjercicio;

import java.util.ArrayList;

public class UsoDeLambda {
    private int elevadoACuadrado;
    private static int[] numeros;
    private ArrayList<Integer> pares;
    public UsoDeLambda(){
        pares = new ArrayList<>();
    }
    public void filtrarYElevarParesAlCuadrado(int[] numeros){
        this.numeros = numeros;

        for (int numero: numeros){
            if(numero % 2 == 0){
                elevadoACuadrado = numero*numero;
                pares.add(elevadoACuadrado);
            }
        }
        Runnable lambda = () -> mostrarNumeros();
    }
    
    public int mostrarNumeros(){
        for(int p: pares){
            return p;
        }
        return 0;
    }

    public static void main(String[] args) {
        UsoDeLambda usoDeLambda = new UsoDeLambda();
        
        int[] numero = {2,6,2,4,2};
        usoDeLambda.filtrarYElevarParesAlCuadrado(numero);

    }
}
