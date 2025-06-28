package ar.edu.unlp.oo2.Parcial2;

public class Jugador {
	private String nombre;
	private Item bolsa;
	
	public Jugador(String nombre, int capacidad) {
		super();
		this.nombre = nombre;
		bolsa = new Bolsa(capacidad,1);
	}
	
	public Bolsa buscarBolsa(int espacio) {
		return this.bolsa.buscarBolsa(espacio);
		
	}
	
	public Item buscarPorNombre(String nombre) {
		return this.bolsa.buscarPorNombre(nombre);
	}
	
	public int espacioMaximoDisponible() {
		return this.bolsa.getEspacioMaximoDisponible();
	}

	public int capacidadDisponible() {
		// TODO Auto-generated method stub
		return bolsa.capacidadMaxima();
	}
}
