/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio2_PiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
	
	Game game;
	@BeforeEach
	void setUp() throws Exception {
		game= new Game();
	}
    @Test
    public void testGameTijeraWon() {
       
       assertEquals(game.play(new Tijera(), new Papel()),"Gano Tijera");
       assertEquals(game.play(new Papel(), new Tijera()),"Gano Tijera");
     
    }
    
    @Test
    public void testGamePiedraWon() {
    	 assertEquals(game.play(new Piedra(), new Tijera()),"Gano Piedra");
         assertEquals(game.play(new Tijera(), new Piedra()),"Gano Piedra"); 
    }
    @Test
    public void testGamePapelWon() {
    	assertEquals(game.play(new Papel(), new Piedra()),"Gano Papel");
        assertEquals(game.play(new Piedra(), new Papel()),"Gano Papel"); 
    }
    
    public void testGameEmpate() {
    	assertEquals(game.play(new Papel(), new Papel()),"Empate");
        assertEquals(game.play(new Piedra(), new Piedra()),"Empate"); 
        assertEquals(game.play(new Tijera(), new Tijera()),"Empate"); 
    }
}

