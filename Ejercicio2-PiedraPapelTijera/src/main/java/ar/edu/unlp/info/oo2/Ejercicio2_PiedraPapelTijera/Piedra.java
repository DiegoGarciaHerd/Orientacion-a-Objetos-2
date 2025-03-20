package ar.edu.unlp.info.oo2.Ejercicio2_PiedraPapelTijera;

public class Piedra implements Jugada {

	@Override
	public String play(Jugada jugada) {
		return jugada.playPiedra();
	}

	@Override
	public String playTijera() {
		return "Gano Piedra";
		
	}

	@Override
	public String playPiedra() {
		return "Empate";
	}

	@Override
	public String playPapel() {
		return "Gano Papel";
	}
	
	public String playSpock() {
		return "Gano Spock";
	}
	
	public String playLagarto() {
		return "Gano Piedra";
	}
}
