/*Se requiere poder tener un Museo de elementos de guerra
Cada elemento o item del museo debe tener una fecha de ingreso al mismo
 */

import java.time.*;

public class RecursoMuseo{
    private LocalDate fecha;
    private Ejercito ejercito;

    public RecursoMuseo(Ejercito ejercito, LocalDate fecha){
        this.setEjercito(ejercito);
        this.setFecha(fecha);
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Ejercito getEjercito() {
        return ejercito;
    }
    public void setEjercito(Ejercito ejercito) {
        this.ejercito = ejercito;
    }
    public String Museo(){
        return "[RecursoMuseo]:Fecha de muerte: "+ this.fecha + " Ejercito: " + this.ejercito.imprimir();
    }


}