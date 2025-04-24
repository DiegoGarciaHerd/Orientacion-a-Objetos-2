package ar.edu.unlp.info.oo1.ej5_DecodificadorPeliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {
	private List<Pelicula> peliculas;
	private List<Pelicula> reproducidas;
	
	private Strategy strategy; 
	
	public Decodificador(List<Pelicula> peliculas, List<Pelicula> reproducidas) {
		this.peliculas = new ArrayList<Pelicula>(peliculas);
		this.reproducidas = new ArrayList<Pelicula>(reproducidas);
		
	}
	
	public void sugerir() {
		List<Pelicula> noVistas = this.peliculas.stream()
		        .filter(p -> !reproducidas.contains(p))
		        .collect(Collectors.toList());

		    strategy.sugerir(noVistas);
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
}
