package ar.edu.unlp.info.oo2.ej18_FileManager;

import java.time.LocalDate;

public class NombreDecorator extends FileDecorator {

	public NombreDecorator(File file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		StringBuilder str= new StringBuilder();
		str.append(super.file.getNombre());
		return str.toString();
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate getFechaModificacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTamaño() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
