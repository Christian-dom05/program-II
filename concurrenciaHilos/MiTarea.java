package concurrenciaHilos;

public class MiTarea implements Runnable{
    @Override
    public void run() {
        System.out.println("Tarea ejecutada en un hilo");
    }

    public static void main(String[] args) {
        MiTarea tarea = new MiTarea();
        Thread hilo = new Thread(tarea); // Hace que la tarea se haga en otro hilo
        hilo.start();
    }
}
