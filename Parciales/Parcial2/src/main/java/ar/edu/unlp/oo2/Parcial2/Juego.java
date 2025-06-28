package ar.edu.unlp.oo2.Parcial2;

public class Juego {
	private Jugador jugador;
	
	public void registrarJugador (String nombre, int capacidad) {
		jugador = new Jugador(nombre,capacidad);
	}
	
	public boolean guardarObjeto(Item objeto) {
		Bolsa bolsa =jugador.buscarBolsa(objeto.getEspacio());
		if(bolsa != null) {
			bolsa.addItem(objeto); 
			return true;
		}
		else {
			return false ;
		}
	}
	
	public Item buscarPorNombre(String nombre) {
		Item item =this.jugador.buscarPorNombre(nombre);
		return item;
	}
	
	public int espacioMaximoDisponible(Jugador jugador) {
		return jugador.espacioMaximoDisponible();
	}
	
	public int capacidadDisponible(Jugador jugador) {
		return jugador.capacidadDisponible();
	}
}
