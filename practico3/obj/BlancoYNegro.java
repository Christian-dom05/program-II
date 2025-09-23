package practico3.obj;

public class BlancoYNegro implements IOperacionImagen{
    private Imagen target;
    public BlancoYNegro(Imagen imagen) {
        this.target = imagen;
    }
    @Override
    public void ejecutar() {
        Imagen resultado = new Imagen(target.getAncho(), target.getAlto());

        for (int i = 0; i < target.getAncho(); i++) {
            for (int j = 0; j < target.getAlto(); j++) {
                int r = target.getR(i,j);
                int g = target.getG(i,j);
                int b = target.getB(i,j);
                int res = (r + g + b) / 3;
                if(res >= 128){
                    resultado.setPixel(i,j,255,255,255);
                }else {
                    resultado.setPixel(i,j, 0, 0, 0);
                }
            }
        }

        target.setPixeles(resultado.getAncho(), resultado.getAlto(),
                resultado.getPixeles());
    }
}
