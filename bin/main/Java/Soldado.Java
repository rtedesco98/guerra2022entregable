package main.Java;

public class Soldado extends Ejercito {
    private Cuchillo Karambit; //Karambit = Cuchillo de mano que se ve mucho en juegos//
    private Ametralladora Odin; //Odin = Una ametralladora de un juego que conozco//

    public Soldado(String nombre, Float danio, Float vida, Cuchillo armaMelee, Ametralladora armaRango) {
        super(nombre, danio, vida);
        this.setArmaMelee(armaMelee);
        this.setArmaRango(armaRango);
    }
    public Soldado(String nombre, Float danio, Float vida, Ametralladora armaRango) {
        super(nombre, danio, vida);
        this.setArmaRango(armaRango);
    }
    public Soldado(String nombre, Float danio, Float vida, Cuchillo armaMelee) {
        super(nombre, danio, vida);
        this.setArmaMelee(armaMelee); 
    }
    public Soldado(String nombre, Float danio, Float vida) {
        super(nombre, danio, vida); 
    }
    public Cuchillo getArmaMelee() {
        return Karambit;
    }
    public void setArmaMelee(Cuchillo arma) {
        this.Karambit = arma;
    }
    public Ametralladora getArmaRango() {
        return Odin;
    }
    public void setArmaRango(Ametralladora arma) {
        this.Odin = arma;
    }
    public float danioMelee(){
        if (this.getArmaMelee() != null){
            return this.getArmaMelee().getDanio() * this.getDanio();
        }
        else{
            return this.getDanio()*0.05f;
        }    
    }
    public float danioDistancia(){
        if (this.getArmaRango() == null){
            return this.getDanio()*0.10f;
        }
        else{
            if (this.getArmaRango().getMunicion() > 0){
                this.getArmaRango().setMunicion(this.getArmaRango().getMunicion() - 1);
                return this.getArmaRango().getDanio() * this.getDanio();
            }
            else{
                return 0;
            }
        }
    }
    public String imprimir() {
        return "[Soldado]" + super.imprimir();
    }
} 


/*

 Tedesco;
 Bury;
 Herrera M.
    
    */