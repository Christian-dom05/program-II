package practico3.obj;

public class EfectoVertical implements IOperacionImagen {
    private int pixelesInvertidos[][];
    private int pixeles[][];
    private Imagen imagen;
    private int h;
    private int w;
    public EfectoVertical(Imagen imagen){
        this.imagen = imagen;
        pixeles = imagen.getPixeles();
    }
    @Override
    public void ejecutar() {
        h = imagen.getAncho();
        w = imagen.getAlto();

        // creamos una matriz invertida
        pixelesInvertidos = new int[w][h];

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                pixelesInvertidos[i][j] = pixeles[j][i];
            }
        }
        imagen.setPixeles(w,h,pixelesInvertidos);
    }
}
