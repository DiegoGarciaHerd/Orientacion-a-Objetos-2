package ar.edu.unlp.info.oo1.ej5_DecodificadorPeliculas;

import java.util.List;

public class Novedad extends Strategy {

	@Override
	public void sugerir(List<Pelicula> peliculas) {
		List<Pelicula> peliculasASugerir = peliculas.stream()
				  .sorted((p1,p2) -> Integer.compare(p1.getAñoEstreno(),p2.getAñoEstreno()))
				  .limit(3)
				  .toList();
		peliculasASugerir.toString();

	}
	
}
