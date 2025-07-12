package ar.edu.unlp.info.oo2.ej18_FileManager;

import java.time.LocalDate;

public class FileDecorator implements File {
	protected File file;
	
	public FileDecorator(File file) {
		this.file = file;
	}
	public String prettyPrint() {
		return file.prettyPrint();
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return file.getNombre();
	}
	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return file.getExtension();
	}
	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return file.getFechaCreacion();
	}
	@Override
	public LocalDate getFechaModificacion() {
		// TODO Auto-generated method stub
		return file.getFechaModificacion();
	}
	@Override
	public int getTamaño() {
		// TODO Auto-generated method stub
		return file.getTamaño();
	}
	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return file.getPermisos();
	}
	
	
	
}
