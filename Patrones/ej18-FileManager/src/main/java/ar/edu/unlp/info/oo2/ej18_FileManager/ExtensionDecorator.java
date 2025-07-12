package ar.edu.unlp.info.oo2.ej18_FileManager;

public class ExtensionDecorator extends FileDecorator {

	public ExtensionDecorator(File file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return super.prettyPrint() + this.getExtension();
	}
}
