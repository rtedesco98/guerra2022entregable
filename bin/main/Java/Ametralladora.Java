
public class Ametralladora extends ArmaBase {
    private int municion;

    public Ametralladora(String nombre, Float danio, int municion) {
        super(nombre, danio);
        this.setMunicion(municion);
    }

    public int getMunicion() {
        return municion;
    }
    public void setMunicion(int municion) {
        this.municion = municion;
    }
}