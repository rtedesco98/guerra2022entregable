public class Tanque extends Vehiculo{
    Soldado conductor;
    public Tanque(String nombre, Float danio, Float vida, Soldado conductor) {
        super(nombre, danio, vida);
        setConductor(conductor);
    }
    Soldado getConductor(){
        return conductor;
    }
    public void setConductor(Soldado conductor){
        this.conductor = conductor;
    }
    @Override
    public String imprimir(){
        
        return "[Tanque]" + super.imprimir() + "[Conductor]:" +this.getConductor().imprimir();
    }
}

/*

 Tedesco;
 Bury;
 Herrera M.
    
    */