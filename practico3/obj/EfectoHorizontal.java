package practico3.obj;

public class EfectoHorizontal implements IOperacionImagen{
    private Imagen target;
    private int[][] matrizHorizontal;
    private int[][] matrizOriginal;
    private int h,w;
    public EfectoHorizontal(Imagen imagen){
        this.target = imagen;
    }
    @Override
    public void ejecutar() {
        w = target.getAncho();
        h = target.getAlto();

        // creamos una matriz invertida
        //matrizHorizontal = new int[w][h];

        Imagen resultado = new Imagen(w,h);

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                resultado.setPixel(i, j, target.get(w - 1 - i, j));
            }
        }
        target.setPixeles(w,h, resultado.getPixeles());
    }
}
