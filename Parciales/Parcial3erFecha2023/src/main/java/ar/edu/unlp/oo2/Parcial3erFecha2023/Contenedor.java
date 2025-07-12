package ar.edu.unlp.oo2.Parcial3erFecha2023;

import java.util.List;
import java.util.stream.Collectors;

public class Contenedor extends Componente {
	private List<Componente> componentes;
	
	public void agregar(Componente c) {
		this.componentes.add(c);
	}
	@Override
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.componentes.stream().forEach(c-> c.aplicarEstilo(estilo));
							 					   
	}

	@Override
	public String imprimir() {
		String contenido = this.componentes.stream()
		        .map(c -> c.imprimir())
		        .collect(Collectors.joining("\n"));

		    return "<contenedor>\n" + contenido + "\n</contenedor>";
	}
	
	
}
