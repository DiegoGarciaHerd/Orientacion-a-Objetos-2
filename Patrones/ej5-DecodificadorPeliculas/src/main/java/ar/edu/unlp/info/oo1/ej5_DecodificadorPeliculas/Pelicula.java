package ar.edu.unlp.info.oo1.ej5_DecodificadorPeliculas;

import java.util.List;

public class Pelicula {
	private String titulo;
	private int añoEstreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAñoEstreno() {
		return añoEstreno;
	}
	public void setAñoEstreno(int añoEstreno) {
		this.añoEstreno = añoEstreno;
	}
	
	public double getPuntaje() {
		return puntaje;
	}
	
	public List<Pelicula> getSimilares(){
		return similares;
	}
	
	
	
}
