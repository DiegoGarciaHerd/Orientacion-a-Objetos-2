package ar.edu.unlp.info.oo2.Ejercicio2_PiedraPapelTijera;

public class Lagarto implements Jugada {
	@Override
	public String play(Jugada jugada) {
		return jugada.playLagarto();
	}

	@Override
	public String playPiedra() {
		return "Gano Piedra";
	}

	@Override
	public String playPapel() {
		return "Gano Lagarto";
	}

	@Override
	public String playTijera() {
		return "Gano Tijera";
	}

	@Override
	public String playLagarto() {
		return "Empate";
	}

	@Override
	public String playSpock() {
		return "Gano Lagarto";
	}

}
