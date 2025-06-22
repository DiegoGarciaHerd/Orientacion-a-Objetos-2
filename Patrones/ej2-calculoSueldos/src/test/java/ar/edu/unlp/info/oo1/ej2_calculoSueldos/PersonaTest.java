package ar.edu.unlp.info.oo1.ej2_calculoSueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PersonaTest {
	
	Empleado guido;
	Empleado ruso;
	Empleado thiago;
	
	@BeforeEach
	void setUp() throws Exception {
		guido= new Pasante(100,"Casado",3,5,2);
		ruso= new Planta(100,"Casado",3,5);
		thiago = new Temporario(100,"Casado",3,5);
	}
	
    @Test
    public void testPasante() {
        assertEquals(guido.sueldo(), 21200);
 
    }
    
    @Test
    public void testPlanta() { 
    	assertEquals(ruso.sueldo(), 63450);
    }
    
    @Test
    public void testTemporario() { 
    	assertEquals(thiago.sueldo(), 53950);
    }
}
