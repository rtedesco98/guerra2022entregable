public class Ejercito {
    private String nombre;
    private Float danio;
    private float vida;
    private float vidaQuitada;
    public Ejercito(String nombre, Float danio, Float vida){
        this.setNombre(nombre);
        this.setDanio(danio);
        this.setVida(vida);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Float getDanio() {
        return danio;
    }
    public void getDanio(Float danio) {
        this.danio = danio;
    }
    public float getVida() {
        return vida;
    }
    public void setVida(Float vida) {
        this.vida = vida;
    }

    public String imprimir(){

        return " Nombre: "+this.getNombre()+" Vida: "+this.getVida()+" Danio: "+this.getDanio()+" ";
    }

}