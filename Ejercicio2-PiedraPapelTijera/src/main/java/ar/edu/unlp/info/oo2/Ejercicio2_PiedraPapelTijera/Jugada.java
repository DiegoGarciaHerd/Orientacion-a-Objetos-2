package ar.edu.unlp.info.oo2.Ejercicio2_PiedraPapelTijera;

public interface Jugada {
	
	String play(Jugada jugada);
	
	String playTijera();
	
	String playPiedra();
	
	String playPapel();

	String playSpock();
	
	String playLagarto();
}
