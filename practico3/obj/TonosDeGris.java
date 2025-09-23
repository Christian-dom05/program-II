package practico3.obj;

import practico3.obj.Imagen;

public class TonosDeGris implements IOperacionImagen{
    private Imagen target;
    public TonosDeGris(Imagen imagen){
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
                int gris = (r + g + b) / 3;
                resultado.setPixel(i,j, gris, gris, gris);
            }
        }

        target.setPixeles(resultado.getAncho(), resultado.getAlto(),
                resultado.getPixeles());
    }
}
