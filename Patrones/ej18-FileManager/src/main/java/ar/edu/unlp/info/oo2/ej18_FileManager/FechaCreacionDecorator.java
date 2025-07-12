package ar.edu.unlp.info.oo2.ej18_FileManager;

public class FechaCreacionDecorator extends FileDecorator {

	public FechaCreacionDecorator(File file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getFechaCreacion();
	}

}
