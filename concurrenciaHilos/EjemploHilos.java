package concurrenciaHilos;

public class EjemploHilos implements Runnable{
    private int numHilo;
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("Hilo "+numHilo);
        }
    }
    public EjemploHilos(int numHilo){
        this.numHilo = numHilo;
    }

    public static void main(String[] args) {
        EjemploHilos h1 = new EjemploHilos(1);
        EjemploHilos h2 = new EjemploHilos(2);

        Thread hilo1 = new Thread(h1);
        Thread hilo2 = new Thread(h2);

        hilo1.start();
        hilo2.start();
    }
}
