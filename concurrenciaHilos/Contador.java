package concurrenciaHilos;

public class Contador extends Thread{
    private static int contador = 0;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            incrementar();
            //contador++;
            //System.out.println("Contador: "+contador);
        }
    }
    public static synchronized void incrementar(){
        contador++;
        System.out.println("Contador: "+contador);
    }

    public static void main(String[] args) {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();

        contador1.start();
        contador2.start();

        /*try{
            contador1.join();
            contador2.join();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

    }
}
