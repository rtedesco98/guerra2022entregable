import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class AppTest 
{
    @Test
    public void debe_crear_un_soldado(){
        Soldado soldado = new Soldado ("Chamber", 1.5f, 100f);
        assertEquals("[Soldado] Nombre: Chamber Vida: 100.0 Daño: 1.5 ", soldado.imprimir());
    }
    @Test
    public void debe_crear_un_tanque() {
        Soldado soldado = new Soldado("Chamber", 1.5f, 100f);
        Tanque tanque = new Tanque("Tanque", 1.5f, 100f, soldado);
        tanque.imprimir();
        System.out.println("");
        soldado.imprimir();
        assertEquals("[Soldado] Nombre: Chamber Vida: 100.0 Daño: 1.5 ", soldado.imprimir());
        assertEquals("[Tanque] Nombre: Tanque Vida: 100.0 Daño: 1.5 [Conductor]:[Soldado] Nombre: Chamber Vida: 100.0 Daño: 1.5 ", tanque.imprimir());
    }
    @Test
    public void debe_crear_un_buque(){
        Cuchillo armaMelee = new Cuchillo();
        Ametralladora armaRango = new Ametralladora("Odin", 1.25f, 3);
        Soldado soldado = new Soldado("Chamber", 1.5f, 100f, armaMelee, armaRango);       
        Buque buque = new Buque("Buque", 1.5f, 100f, soldado);
        buque.imprimir();
        assertEquals("[Buque] Nombre: Buque Vida: 100.0 Daño: 1.5 [Conductor]:[Soldado] Nombre: Chamber Vida: 100.0 Daño: 1.5 ", buque.imprimir());
    }
    @Test
    public void soldado_debe_disparar(){
        Soldado soldado0 = new Soldado("Chamber", 1.5f, 100f);
        Soldado soldado1 = new Soldado("Brimstone", 1.5f, 1f);
        Escudo escudo0 = new Escudo();
        escudo0.setDefensa0();
        Ametralladora armaRango = new Ametralladora("Odin", 1.25f, 3);
        soldado0.setArmaRango(armaRango);
        soldado0.atacar(soldado1, escudo0, soldado0.danioDistancia());
        assertEquals(0.0f, soldado1.getVida(), 0.0f);
    }

    @Test
    public void tanque_debe_disparar(){
        Soldado soldado = new Soldado("Chamber", 1.5f, 1f);
        Tanque tanque = new Tanque("TanquenBER", 2f, 2f, soldado);
        Soldado soldado1 = new Soldado("Brimstone", 1.5f, 1f);
        Tanque tanque1 = new Tanque("TanqueStone",2f, 2f, soldado1);
        Escudo escudo1 = new Escudo();
        escudo1.setDefensa0();
        tanque.atacar(tanque1, escudo1, tanque.getDanio());
        assertEquals(1.0f, soldado1.getVida(), 0.0f);
    }

    @Test
    public void debe_atacar_a_otra_tropa_tanque_a_soldado(){
    }
    @Test 
    public void debe_atacar_tanque_a_buque(){       
    }
    @Test
    public void debe_crear_un_soldado_sin_escudo(){
    }

    /**
     * 
     */
    @Test
    public void buque_debe_disparar(){
        Soldado soldado = new Soldado("Chamber", 1.5f, 1f);
        Buque buque = new Buque("Buque", 3f, 3f, soldado);
        Soldado soldado1 = new Soldado("Chamber", 1.5f, 1f);
        Buque buque1 = new Buque("Buque", 3f, 3f, soldado1);
        Escudo escudo2 = new Escudo();
        escudo2.setDefensa0();
        buque.atacar(buque1, escudo2, buque.getDanio());
        assertEquals(1.5f, buque1.getVida(), 0.0f);
    }

    @Test
    public void meterCosasMuseo(){
        Museo museo = new Museo();
        Tanque[] tanquesazo = new Tanque[300];
        Soldado[] soldadin = new Soldado[300];
        Buque[] buquezon = new Buque[300];
        Soldado soldado = new Soldado("Chamber", 1.5f, 10f);
        Soldado brimstone = new Soldado("Brimstone", 1500000000f, 100f);
        for (int i = 0; i < 300; i++) {
            soldadin[i] = new Soldado("Chamber", 1.5f, 10f);
            tanquesazo[i] = new Tanque("Tanque", 1.5f, 10f, soldado);
            buquezon[i] = new Buque("Buque", 1.5f, 10f, soldado);
        }
        for (int i =  0; i < 300; i++){
            brimstone.atacar(soldadin[i], null, brimstone.danioDistancia());
            RecursoMuseo muereChamber = new RecursoMuseo(soldadin[i], LocalDate.now());
            assertEquals(true, museo.agregarRecurso(muereChamber));
            brimstone.atacar(tanquesazo[i], null, brimstone.danioDistancia());
            RecursoMuseo muereTanque = new RecursoMuseo(tanquesazo[i], LocalDate.now());
            assertEquals(true, museo.agregarRecurso(muereTanque));
            brimstone.atacar(buquezon[i], null, brimstone.danioDistancia());
            RecursoMuseo muereBuque = new RecursoMuseo(buquezon[i], LocalDate.now());
            assertEquals(true, museo.agregarRecurso(muereBuque));
        }
         assertEquals(900, museo.getRecursos().size());
    }
}