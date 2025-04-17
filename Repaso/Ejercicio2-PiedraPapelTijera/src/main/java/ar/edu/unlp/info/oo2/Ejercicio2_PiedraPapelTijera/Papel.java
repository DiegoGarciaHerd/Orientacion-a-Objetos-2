package ar.edu.unlp.info.oo2.Ejercicio2_PiedraPapelTijera;

public class Papel implements Jugada {

	@Override
	public String play(Jugada jugada) {
		return jugada.playPapel();
	}

	@Override
	public String playTijera() {
		return "Gano Tijera";
	}

	@Override
	public String playPiedra() {
		return "Gano Papel";
	}

	@Override
	public String playPapel() {
		return "Empate";
	}
	
	@Override
	public String playLagarto() {
		return "Gano Lagarto";
	}

	@Override
	public String playSpock() {
		return "Gano Papel";
	}
}
