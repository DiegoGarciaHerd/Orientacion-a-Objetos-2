package ar.edu.unlp.info.oo2.ej12_Filesystem;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends Componente {
	private List<Componente> contenido;
	
	
	public int getCantBytes() {
		return 32000 + contenido.stream().mapToInt(c -> c.getCantBytes()).sum();
	}
	
	public Archivo archivoMasNuevo() {
		return contenido.stream().map(c -> c.archivoMasNuevo()).max((c1,c2)-> c1.getFechaCreacion().compareTo(c2.getFechaCreacion()))
				.orElse(null);
	}
	
	public Archivo archivoMasGrande() {
		return contenido.stream().map(c -> c.archivoMasGrande()).max((c1,c2)-> Integer.compare(c1.getCantBytes(), c2.getCantBytes()))
				.orElse(null);
	}
	
	@Override
	public Componente buscar(String nombre) {
		 return this.getNombre().equals(nombre) ? this : 
     		this.contenido.stream().map(elem -> elem.buscar(nombre))
             .filter(elemento -> elemento != null).findFirst().orElse(null);
	}
	
	@Override
	public void buscarTodos(String nombre,List<Componente> lista) {
		if(this.getNombre().equals(nombre)) {
			lista.add(this);
		}
		
		this.contenido.stream().forEach(c -> c.buscarTodos(nombre,lista));
		
	}
	
	public String listadoDeContenido(String nombre) {
		StringBuilder res = new StringBuilder();
		String pathActual = nombre + this.getNombre();
		res.append(pathActual).append("\n");
		res.append(
				this.contenido.stream().map(c-> c.listadoDeContenido(pathActual + "/"))
				.collect(Collectors.joining())	
				);
		return res.toString();
	}
	
}
