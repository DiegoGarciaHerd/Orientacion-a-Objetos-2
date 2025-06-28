package ar.edu.unlp.info.oo2.ej12_Filesystem;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends Componente {

	
	@Override
	public double getTamanio() {
		return this.getCantBytes();
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
	public int getCantBytes() {
		// TODO Auto-generated method stub
		return 0;
	}
}
