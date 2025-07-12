package ar.edu.unlp.oo2.Parcial1erFecha2022;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TextExcursion {
	Usuario usuario1;
	Usuario usuario2;
	Usuario usuario3;
	Excursion excursion;
	
	@BeforeEach
	void setUp() {
		usuario1=new Usuario("Diego","Garcia Herd","diego@gmail.com");
		usuario2=new Usuario("Caedrel","Sally","cae@cu");
		usuario3=new Usuario("Becker","Boris","boris@gmail.cu");
		
		excursion=new Excursion("Dos dias en kayak bajando el Paraná",3,5);
		excursion.inscribir(usuario2);
		excursion.inscribir(usuario3);
	}
	
	@Test
	void testEjemplo () {
		excursion.inscribir(usuario1);
		assertEquals(excursion.getCantInscriptos(),3);
		assertEquals(excursion.getInformacion(),"Dos dias en kayak bajando el Paraná0.0nullnullnull\r\n"
				+ "Inscriptos: cae@cu, boris@gmail.cu, diego@gmail.com\r\n"
				+ "Cant faltante para cupo maximo: 2");
	}
}
