package ar.edu.unlp.oo2.Parcial2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoTest {
	
	Jugador jugador;
	Juego juego;
	
	@BeforeEach
	void setUp() {
		juego = new Juego();
		juego.registrarJugador("Malcolm", 10);
		juego.guardarObjeto(new ConcreteItem(3));
		juego.guardarObjeto(new Bolsa(3,13));
		
	}
	
	@Test 
	void registrarJugador() {
		juego.registrarJugador("Malcolm", 10);
	}
	
	@Test
	void guardarObjeto() {
		assertEquals(true,juego.guardarObjeto(new ConcreteItem(3)));
		assertEquals(true,juego.guardarObjeto(new Bolsa(3,13)));
	}
	
	void probarItemTamaño30() {
		assertEquals(null,juego.guardarObjeto(new ConcreteItem(30)));
	}
}
