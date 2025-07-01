package ejercicio4;

public class Casa {
    private Foco foco1;
    public Casa(Foco foco){
        this.foco1 = foco;
    }

    public void cambiarFoco(Foco focoNuevo){
        this.foco1 = focoNuevo;
    }

    @Override
    public String toString() {
        return "Foco: "+foco1.getNombre();
    }

    public static void main(String[] args) {
        Foco foco = new Foco("Lumileds");
        Casa casa = new Casa(foco);

        System.out.println(casa.toString());

        Foco nuevoFoco = new Foco("Samsung");
        casa.cambiarFoco(nuevoFoco);

        System.out.println(casa.toString());
    }
}
