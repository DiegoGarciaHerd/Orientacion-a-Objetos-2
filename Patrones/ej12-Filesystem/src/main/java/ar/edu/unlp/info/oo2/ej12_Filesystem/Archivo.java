package ar.edu.unlp.info.oo2.ej12_Filesystem;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends Componente {
	private int cantBytes;
	
	@Override
	public int getTamanio() {
		return this.cantBytes;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}
	
	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	
	@Override
	public Componente buscar(String nombre) {
		return this.compareName(nombre) ? this : null;
	}

	@Override
	public void buscarTodos(String nombre, List<Componente> lista) {}
	
	@Override
    public String listadoDeContenido(String prefijo) {
        return prefijo + this.getNombre() + "\n";
    }


	@Override
	protected void buscarEnHijos(String nombre, List<Componente> lista) {
		// TODO Auto-generated method stub
		
	}
	
}
