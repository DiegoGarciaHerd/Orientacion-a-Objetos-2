package ar.edu.unlp.info.oo2.ej11_Topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiasTest {
	private Topografia agua;
	private Topografia tierra;
	private Topografia mixta1;
	private Topografia mixta2;

	@BeforeEach
	public void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		mixta1 = new Mixta(new Agua(),new Tierra(),new Tierra(),new Agua());
		mixta2 = new Mixta(new Agua(),new Tierra(),new Tierra(),mixta1);
	}

	
	@Test
	public void testGetProporcionAgua() {
		assertEquals(0,tierra.proporcionDeAgua());
		assertEquals(1,agua.proporcionDeAgua());
		assertEquals(0.5,mixta1.proporcionDeAgua());
		assertEquals(0.375,mixta2.proporcionDeAgua());
	}
	
	@Test
	public void testIsEquals() {
		assertTrue(this.tierra.equals(new Tierra()));
		assertFalse(this.tierra.equals(new Agua()));
		assertFalse(this.agua.equals(new Tierra()));
		assertTrue(this.agua.equals(new Agua()));
		assertFalse(this.mixta1.equals(agua));
		assertFalse(this.mixta1.equals(mixta2));
		assertTrue(this.mixta1.equals(new Mixta(new Agua(),new Tierra(),new Tierra(),new Agua())));
		assertTrue(this.mixta2.equals(new Mixta(new Agua(),new Tierra(),new Tierra(),mixta1)));
		assertFalse(this.mixta2.equals(new Mixta(new Agua(),new Tierra(),mixta1,new Tierra())));
	}
}
