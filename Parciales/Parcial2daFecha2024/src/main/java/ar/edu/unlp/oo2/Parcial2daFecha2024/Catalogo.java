package ar.edu.unlp.oo2.Parcial2daFecha2024;

import java.util.List;

public class Catalogo {
	private List<Componente> componentes;
	
	public Componente getComponente(String descripcion) {
		 return this.componentes.stream()
			        .filter(c -> c.getNombre().equals(descripcion))
			        .findFirst()
			        .orElse(null);
	}
	
	
}
