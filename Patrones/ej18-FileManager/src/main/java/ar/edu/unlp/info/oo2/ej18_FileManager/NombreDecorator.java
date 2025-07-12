package ar.edu.unlp.info.oo2.ej18_FileManager;

import java.time.LocalDate;

public class NombreDecorator extends FileDecorator {

	public NombreDecorator(File file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return super.prettyPrint() + this.getNombre();
	}

	

	
}
