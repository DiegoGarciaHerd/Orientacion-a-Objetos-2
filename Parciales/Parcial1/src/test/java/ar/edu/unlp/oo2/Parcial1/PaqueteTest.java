package ar.edu.unlp.oo2.Parcial1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaqueteTest {
	IPaquete paquete;
	
	@BeforeEach
	void setUp() {
		paquete = new Paquete("Caja de libros",20000);
	}
	
	@Test
	public void getDescripcionCajaDeLibros() {
		paquete = new EntregaDecorator(paquete);
		paquete = new SeguroDecorator(paquete);
		
		
		assertEquals(15000, paquete.getCostoEnvio());
	}
}
