package ar.edu.unlp.info.oo2.ej18_FileManager;

public class PermisosDecorator extends FileDecorator {

	public PermisosDecorator(File file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + this.getPermisos();
	}

}
