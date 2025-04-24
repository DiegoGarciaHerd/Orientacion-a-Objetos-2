package ar.edu.unlp.info.oo1.ej5_DecodificadorPeliculas;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Similaridad extends Strategy{

	@Override
	public void sugerir(List<Pelicula> peliculas) {
		List<Pelicula> peliculasASugerir = peliculas.stream()
								.flatMap(p -> p.getSimilares().stream())
								.distinct()
								.sorted((p1,p2) -> Integer.compare(p2.getAñoEstreno(), p1.getAñoEstreno()))
								.toList();
		peliculasASugerir.toString();
						  
	}

}
