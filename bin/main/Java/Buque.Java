public class Buque extends Vehiculo {
    private Soldado conductor;
    public Buque(String nombre, Float danio, Float vida, Soldado conductor) {
        super(nombre, danio, vida);
        setConductor(conductor);
    }
    public Soldado getConductor() {
        return conductor;
    }
    public void setConductor(Soldado conductor) {
        this.conductor = conductor;
    }
    /* Mirar el UML por eso el override */
    @Override
    public String imprimir(){
        return "[Buque]" + super.imprimir() +"[Conductor]:" +this.getConductor().imprimir();
    }
}


/*

 Tedesco;
 Bury;
 Herrera M.
    
    */