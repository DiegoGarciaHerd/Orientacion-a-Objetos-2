package ar.edu.unlp.info.oo2.ej12_Filesystem;

import java.time.LocalDate;
import java.util.List;

public abstract class Componente {
	private String nombre;
	private LocalDate fechaCreacion;
	
	
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
	
	public abstract int getTamanio();
	
	public abstract Archivo archivoMasNuevo();
	
	public abstract Componente buscar(String nombre);
	
	public abstract Archivo archivoMasGrande();
	
	public void buscarTodos(String nombre, List<Componente> lista) {
		if (this.compareName(nombre)) lista.add(this);
		this.buscarEnHijos(nombre, lista);
	}
	
	protected abstract void buscarEnHijos(String nombre, List<Componente> lista);
	
	public abstract String listadoDeContenido(String s);
	
	public boolean compareName(String nombre) {
		return this.nombre.equals(nombre);
	}
}
