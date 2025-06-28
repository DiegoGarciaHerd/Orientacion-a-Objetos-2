package ar.edu.unlp.info.oo2.ej12_Filesystem;

import java.time.LocalDate;
import java.util.List;

public abstract class Componente {
	private String nombre;
	private LocalDate fechaCreacion;
	private int cantBytes;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public abstract int getCantBytes() ;
	
	public abstract Archivo archivoMasNuevo();
	
	public abstract Componente buscar(String nombre);
	
	public abstract Archivo archivoMasGrande();
	
	public abstract void buscarTodos(String nombre,List<Componente> l);
	
	public abstract String listadoDeContenido(String s);
	
}
