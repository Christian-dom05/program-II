package ejercicio3;

import java.util.ArrayList;

public class GuiaTelefonica {
    private ArrayList<Integer> numerosTelefonicos;
    public GuiaTelefonica(ArrayList<Integer> numerosTelefonicos){
        this.numerosTelefonicos = new ArrayList<>(numerosTelefonicos);
    }
    public String buscarNumeroTelefonico(int numero){
        for(int num: numerosTelefonicos){
            if(num == numero){
                return "Número "+num+ " encontrado";
            }
        }
        return "Número no encontrado";
    }

    public static void main(String[] args) {
        int numeroAmigo = 7809232;

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(7839021);
        numeros.add(7349502);
        numeros.add(7480039);
        numeros.add(7203390);
        numeros.add(6720339);
        numeros.add(7809232);

        GuiaTelefonica guiaTelefonica = new GuiaTelefonica(numeros);
        System.out.println(guiaTelefonica.buscarNumeroTelefonico(numeroAmigo));
    }
}
