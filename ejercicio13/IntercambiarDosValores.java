package ejercicio13;

public class IntercambiarDosValores {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        if((a-b)>0){ // si la diferencia es positiva (a es mayor que b)
            for (int i = a-b; i > 0; i--) {
                if((a-b)==i && i>0){ // sólo se ejecuta en la primera vuelta
                    a = b; // guarda el valor de b en a
                }
                b++; // incrementa el valor de b hasta llegar al antiguo valor de a
            }
        }else { // la diferencia es negativa (a es menor que b)
            for (int i = b-a; i > 0; i--) {
                if((b-a)==i && i > 0){ // sólo se ejecuta en la primera vuelta
                    a = b; // guarda el valor de b en a
                }
                b--; // decrece el valor de b hasta llegar al antiguo valor de a
            }
        }

        System.out.println("Valor de a: "+a);
        System.out.println("Valor de b: "+b);

    }
}
