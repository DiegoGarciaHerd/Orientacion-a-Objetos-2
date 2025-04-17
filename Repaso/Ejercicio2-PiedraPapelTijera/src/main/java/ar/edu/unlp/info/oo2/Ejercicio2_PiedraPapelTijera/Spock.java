package ar.edu.unlp.info.oo2.Ejercicio2_PiedraPapelTijera;

public class Spock implements Jugada {
	@Override
	public String play(Jugada jugada) {
		return jugada.playSpock();
	}

	@Override
	public String playPiedra() {
		return "Gano Spock";
	}

	@Override
	public String playPapel() {
		return "Gano Papel";
	}

	@Override
	public String playTijera() {
		return "Gano Spock";
	}

	@Override
	public String playLagarto() {
		return "Gano Lagarto";
	}

	@Override
	public String playSpock() {
		return "Empate";
	}

}
}
