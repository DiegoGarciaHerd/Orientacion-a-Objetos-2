package ar.edu.unlp.oo2.Parcial2;

public abstract class Item {
	private int espacio;
	private String nombre;
	
	public Item(int tamaño) {
		this.espacio = tamaño;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getEspacio() {
		return espacio;
	}
	public void setEspacio(int espacio) {
		this.espacio = espacio;
	}
	
	public abstract Bolsa buscarBolsa(int espacio);
	
	public abstract Item buscarPorNombre(String nombre2);
	public abstract int getEspacioMaximoDisponible();
	public abstract int capacidadMaxima();
	
}
