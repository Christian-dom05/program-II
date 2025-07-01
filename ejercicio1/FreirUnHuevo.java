package ejercicio1;

public class FreirUnHuevo {
    private Huevo huevo;
    private static boolean hornillaEncendida;
    public void FreirUnHuevo(){
        this.hornillaEncendida = false;
    }
    public void colocarHuevoAlSarten(Huevo huevo){
        this.huevo = huevo;
        if(hornillaEncendida){
            coccion();
        }
    }
    public boolean prenderHornilla(){
        if(!hornillaEncendida){
            hornillaEncendida = true;
            if(this.huevo != null){
                coccion();
            }else {
                System.out.println("Sarten listo para fritar");
            }
        }
        return hornillaEncendida;
    }
    private void coccion(){
        if(prenderHornilla() && this.huevo != null){
            System.out.println("Huevo en cocción");
            System.out.println("¡Huevo listo!");
        }
    }

    public static void main(String[] args) {
        FreirUnHuevo freirUnHuevo = new FreirUnHuevo();
        Huevo huevo1 = new Huevo();
        freirUnHuevo.colocarHuevoAlSarten(huevo1);
        freirUnHuevo.prenderHornilla();
    }
}
