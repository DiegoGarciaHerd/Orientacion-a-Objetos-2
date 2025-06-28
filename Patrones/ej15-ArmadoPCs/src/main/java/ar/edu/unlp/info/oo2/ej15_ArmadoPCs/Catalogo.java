package ar.edu.unlp.info.oo2.ej15_ArmadoPCs;

import java.util.List;

public class Catalogo {
	private static List<Componente> componentes;
	
	public static Componente getComponente(String descripcion) {
		return componentes.stream()
				.filter(c-> c.getNombre().equals(descripcion))
				.findFirst()
				.orElse(null);
	}
	
	public static List<Componente> componentes() {
		return componentes;
	}
}
