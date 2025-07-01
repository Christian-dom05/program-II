package ejercicio2;

import java.util.ArrayList;

public class Automovil {
    private Rueda rueda1;
    private Rueda rueda2;
    private Rueda rueda3;
    private Rueda rueda4;
    private String r1, r2, r3, r4;
    public Automovil(){
        this.rueda1 = new Rueda("rueda1");
        this.rueda2 = new Rueda("rueda2");
        this.rueda3 = new Rueda("rueda3");
        this.rueda4 = new Rueda("rueda4");

        this.r1 = "rueda1";
        this.r2 = "rueda2";
        this.r3 = "rueda3";
        this.r4 = "rueda4";
    }

    public void quitarRuedas(String rueda){
        rueda = rueda.toLowerCase();

        if(rueda.equals(r1)){
            rueda1.setNombre(null);
            r1 = null;
        } else if (rueda.equals(r2)) {
            rueda2.setNombre(null);
            r2 = null;
        } else if (rueda.equals(r3)) {
            rueda3.setNombre(null);
            r3 = null;
        } else if (rueda.equals(r4)) {
            rueda4.setNombre(null);
            r4 = null;
        }
    }

    public void colocarRuedas(Rueda nuevaRueda){
        String rueda = nuevaRueda.getNombre();

        if(rueda1.getNombre()==null) rueda1.setNombre(rueda);
        else if (rueda2.getNombre()==null) rueda2.setNombre(rueda);
        else if (rueda3.getNombre()==null) rueda3.setNombre(rueda);
        else if (rueda4.getNombre()==null) rueda4.setNombre(rueda);
    }
}
