package practico3.obj;

public class Agrandar implements IOperacionImagen{
    private Imagen target;
    private int porcentaje;
    public Agrandar(Imagen target, int porcentaje){
        this.target = target;
        this.porcentaje = porcentaje;
    }
    @Override
    public void ejecutar() {
        int wo = target.getAncho();
        int ho = target.getAlto();

        int wNew = (wo * porcentaje) / 100;
        int hNew = (ho * porcentaje) / 100;

        Imagen resultado = new Imagen(wNew, hNew);

        // Algoritmo de interpolación simple (osea duplicacion de pixeles
        for (int i = 0; i < wNew; i++) {
            for (int j = 0; j < hNew; j++) {
                int xOriginal = i * 100 / porcentaje;
                int yOriginal = j * 100 / porcentaje;

// esto es para no salirse del limite :v
                xOriginal = Math.min(xOriginal, wo - 1);
                yOriginal = Math.min(yOriginal, ho - 1);

                resultado.setPixel(i, j, target.get(xOriginal, yOriginal));
            }
        }

//aca usa mi metodo para setear los pixeles nuevos xd
        target.setPixeles(wNew, hNew, resultado.getPixeles());
    }
}
