/*Se requiere poder tener un Museo de elementos de guerra
Cada elemento o item del museo debe tener una fecha de ingreso al mismo
 */

 /*https://www.youtube.com/watch?v=uUWEfmaFOkE miren*/

import java.util.ArrayList;

public class Museo{
    
    ArrayList<RecursoMuseo> recursos = new ArrayList<RecursoMuseo>();
    public RecursoMuseo recursoMuseo;
    
   public ArrayList<RecursoMuseo> getRecursos() {
    return recursos;
   } 

    public Museo(){

    }

    public boolean agregarRecurso(RecursoMuseo recursoMuseo){
        if (recursoMuseo.getTropa().getVida() == 0){
            recursos.add(recursoMuseo);
            return true;
        }
        else{
            return false;
        }
    }
    public void mostrarConsola(){
        for (RecursoMuseo recursoMuseo : recursos){
            System.out.println(recursoMuseo.textoMuseo());
        }
    }

}