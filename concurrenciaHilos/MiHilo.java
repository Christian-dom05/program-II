package concurrenciaHilos;


public class MiHilo extends Thread{
    @Override
    public void run() {
        System.out.println("¡El hilo está ejecutándose!");
    }

    public static void main(String[] args) {
        MiHilo hilo = new MiHilo();
        hilo.start();
    }
}
