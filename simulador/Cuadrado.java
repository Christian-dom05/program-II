package simulador;

public class Cuadrado {
    private int widthCuadrado, heigthCuadrado, xPosition, yPosition;
    private int tamanoCuadrado;
    public Cuadrado(int xPosition, int yPosition, int tamanoCuadrado){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.tamanoCuadrado = tamanoCuadrado;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getTamanoCuadrado() {
        return tamanoCuadrado;
    }

    public void setxPosition(int velocidadEnemigo) {
        if ((xPosition + tamanoCuadrado) < 0){
            xPosition = tamanoCuadrado*(-1);
        }else {
            this.xPosition -= velocidadEnemigo;
        }
    }

    public void intersectaCuadrado(Cuadrado ememigo){

    }
}
