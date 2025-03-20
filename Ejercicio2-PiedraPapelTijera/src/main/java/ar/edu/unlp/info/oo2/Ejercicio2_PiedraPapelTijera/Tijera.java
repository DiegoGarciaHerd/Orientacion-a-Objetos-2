package ar.edu.unlp.info.oo2.Ejercicio2_PiedraPapelTijera;

public class Tijera implements Jugada {
	
	public String play(Jugada jugada) {
		return jugada.playTijera();
	}

	@Override
	public String playTijera() {
		return "Empate";
	}

	@Override
	public String playPiedra() {
		return "Gano Piedra";
	}

	@Override
	public String playPapel() {
		return "Gano Tijera";
	}
	
	@Override
	public String playLagarto() {
		return "Gana Tijera";
	}

	@Override
	public String playSpock() {
		return "Gana Spock";
	}
}
