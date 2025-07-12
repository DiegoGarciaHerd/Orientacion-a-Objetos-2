package ar.edu.unlp.info.oo2.ej18_FileManager;

public class TamañoDecorator extends FileDecorator {

	public TamañoDecorator(File file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return this.prettyPrint() + this.getTamaño();
	}
}
