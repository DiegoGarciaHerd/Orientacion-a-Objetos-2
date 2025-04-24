package ar.edu.unlp.info.oo1.ej5_DecodificadorPeliculas;

import java.util.List;

public class Puntaje extends Strategy {

	@Override
	public void sugerir(List<Pelicula> peliculas) {
		List<Pelicula> peliculasASugerir = peliculas.stream()
				  .sorted((p1,p2)-> Double.compare(p2.getPuntaje(), p1.getPuntaje()))
				  .limit(3)
				  .toList();
		peliculasASugerir.toString();
		
	}
	
}
