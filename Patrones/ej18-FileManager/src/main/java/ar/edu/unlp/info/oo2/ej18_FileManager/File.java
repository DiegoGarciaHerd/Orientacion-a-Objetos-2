package ar.edu.unlp.info.oo2.ej18_FileManager;

import java.time.LocalDate;

public interface File {
	
	public String prettyPrint();
	
	String getNombre();
	String getExtension();
	LocalDate getFechaCreacion();
	LocalDate getFechaModificacion();
	int getTamaño();
	String getPermisos();
	
}
